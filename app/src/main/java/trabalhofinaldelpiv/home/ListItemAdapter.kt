package com.fundatec.trabalhofinaldelpiv.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fundatec.trabalhofinaldelpiv.databinding.ListItemBinding
import trabalhofinaldelpiv.home.data.CharacterResponse


class ListItemAdapter : RecyclerView.Adapter<ListItemViewHolder>() {

    private val list = mutableListOf<CharacterResponse>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun setItems(items: List<CharacterResponse>) {
        list.addAll(items)
        notifyDataSetChanged()
    }

    fun getCharacterId(position: Int): Int {
        return list.get(position).id
    }
    fun removeItem(position: Int){
        list.removeAt(position)
        notifyDataSetChanged()
    }
}