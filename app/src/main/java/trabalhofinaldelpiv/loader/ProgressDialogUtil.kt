package trabalhofinaldelpiv.loader

import android.app.ProgressDialog
import android.content.Context
import com.fundatec.trabalhofinaldelpiv.R
//Nesta classe, criamos uma instância de ProgressDialog e exibi-la quando necessário, e
// também ocultá-la quando a solicitação da API for concluída.
object ProgressDialogUtil {
    private var progressDialog: ProgressDialog? = null

    fun showProgressDialog(context: Context) {
        progressDialog = ProgressDialog(context)
        progressDialog?.setCancelable(false)
        progressDialog?.setContentView(R.layout.progress_dialog)
        progressDialog?.show()
    }

    fun hideProgressDialog() {
        progressDialog?.dismiss()
        progressDialog = null
    }
}
