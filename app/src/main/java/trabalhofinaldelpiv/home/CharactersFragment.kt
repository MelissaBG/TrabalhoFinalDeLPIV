package com.fundatec.trabalhofinaldelpiv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView

import com.fundatec.trabalhofinaldelpiv.databinding.FragmentCharactersBinding
import com.fundatec.trabalhofinaldelpiv.home.ListItemAdapter
import com.fundatec.trabalhofinaldelpiv.login.presentation.CharacterViewModel
import com.fundatec.trabalhofinaldelpiv.login.presentation.CharacterViewState


private const val ARG_PARAM1 = "param1"

class CharacterFragment : Fragment() {

    private lateinit var binding: FragmentCharactersBinding
    private lateinit var adapter: ListItemAdapter

    private val viewModel by lazy {
        ViewModelProvider(requireActivity()).get(CharacterViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCharactersBinding.inflate(inflater)

        adapter = ListItemAdapter()
        binding.recyclerView.adapter = adapter
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.fetchList()
        configItemTouch()
        configObserver()
        arguments?.run {
//            binding.tvName.text = getString(ARG_PARAM1)
        }
    }
    private fun configItemTouch(){
        val simpleItemTouchCallback = object :
            ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, swipeDir: Int) {
                val position = viewHolder.adapterPosition
                adapter.removeItem(position)
                adapter.notifyItemChanged(position)
                viewModel.removeItem(adapter.getCharacterId(position))
            }
        }
        val itemTouchHelper = ItemTouchHelper(simpleItemTouchCallback)
        itemTouchHelper.attachToRecyclerView(binding.recyclerView)
    }

    private fun configObserver(){
        viewModel.viewState.observe(requireActivity()){state ->
            when (state) {
                is CharacterViewState.ShowList -> { adapter.setItems(state.list)}
                is CharacterViewState.ShowLoading -> {}
                is CharacterViewState.ShowError -> {}
            }
        }
    }
    companion object {
        fun newInstance(param1: String) =
            CharacterFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }


}
/*RESUMO: A classe CharacterFragment é usada para exibir uma lista de caracteres em uma view, usando um adaptador
* personalizado para exibir cada elemento de lista em uma view.*/