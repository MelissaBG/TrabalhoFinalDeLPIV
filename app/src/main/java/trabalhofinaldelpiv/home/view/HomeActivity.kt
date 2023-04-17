package trabalhofinaldelpiv.home.view
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.fundatec.trabalhofinaldelpiv.CharacterFragment
import com.fundatec.trabalhofinaldelpiv.NewCharacterActivity
import com.fundatec.trabalhofinaldelpiv.databinding.ActivityHomeBinding
import com.fundatec.trabalhofinaldelpiv.login.presentation.CharacterViewModel
import com.google.android.material.snackbar.Snackbar

import trabalhofinaldelpiv.login.login.presentation.ViewState

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val viewModel: CharacterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        configTab()
        configHomeButton()
        configObserver()
    }
    private fun configObserver() {
        viewModel.viewState.observe(this) { state ->
            when (state) {
                is ViewState.ShowDeleteMessage -> showDeleteMessage("Deletado com sucesso!")
                is ViewState.ShowDeleteError -> showDeleteError("Erro ao deletar!")
            }
        }
    }
    private fun showDeleteMessage(@StringRes messageId: Int){
        hideLoging()
        Snackbar.make(binding.container, messageId, Snackbar.LENGTH_LONG).show()
    }
    private fun showDeleteError(@StringRes messageId: Int){
        hideLoging()
        Snackbar.make(binding.container, messageId, Snackbar.LENGTH_LONG).show()
    }
    private fun hideLoging() {
        binding.pbLoading.visibility = View.VISIBLE
    }

    private fun configTab() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        binding.vpHome.adapter = adapter
        binding.tlHome.setupWithViewPager(binding.vpHome)
    }

    private fun configHomeButton() {
        binding.btnHome.setOnClickListener {
            val intent = Intent(this@HomeActivity, NewCharacterActivity::class.java)
            startActivity(intent)
        }
    }
}

class ViewPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {

        return when (position) {
            0 -> "Heroi"
            1 -> "Vilao"
            else -> {null}
        }
    }

    override fun getItem(position: Int): Fragment {
        val characterType =  when (position) {
            0 -> CharacterType.HEROI
            else -> CharacterType.VILAO
        }
        return CharacterFragment.newInstance(characterType.toString())
    }

}
enum class CharacterType{
    HEROI,
    VILAO
}