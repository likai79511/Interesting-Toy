package k.agera.com.interestingtoy.Alert

import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import k.agera.com.interestingtoy.R

class AlartActivity : AppCompatActivity(), View.OnClickListener {


    lateinit var mRoot: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alart)
        mRoot = findViewById<LinearLayout>(R.id.ll_root)
        initEvents()
    }

    fun initEvents() {
        findViewById<View>(R.id.btn_normal_toast).setOnClickListener(this)
        findViewById<View>(R.id.btn_top_toast).setOnClickListener(this)
        findViewById<View>(R.id.custom_toast).setOnClickListener(this)
        findViewById<View>(R.id.btn_normal_snackbar).setOnClickListener(this)
        findViewById<View>(R.id.btn_action_snackbar).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        v ?: return

        when (v.id) {
            R.id.btn_normal_toast -> {
                showNormalToast()
            }
            R.id.btn_top_toast -> {
                showTopToast()
            }
            R.id.custom_toast -> {
                showCustomToast()
            }
            R.id.btn_normal_snackbar -> {
                showNormalSnackBar()
            }
            R.id.btn_action_snackbar -> {
                showActionSnackbar()
            }
        }

    }


    fun showActionSnackbar() {
        var sb = Snackbar.make(mRoot, "This is take action snackbar", Snackbar.LENGTH_LONG)
                .setAction("Click to disapper", {
                    Toast.makeText(applicationContext, "click button", Toast.LENGTH_SHORT).show()
                })
                .setActionTextColor(Color.GREEN)
        sb.view.setBackgroundColor(Color.GRAY)
        sb.show()

    }

    fun showNormalSnackBar() {
        Snackbar.make(mRoot, "this is Normal Snackbar", Snackbar.LENGTH_SHORT).show()
    }


    fun showNormalToast() {
        Toast.makeText(applicationContext, "This is normal toast", Toast.LENGTH_SHORT).show()
    }

    fun showTopToast() {
        var toast = Toast.makeText(applicationContext, "this is top toast", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP or Gravity.LEFT, 0, 0)
        toast.show()
    }

    fun showCustomToast() {
        var toast = Toast(applicationContext)
        toast.setGravity(Gravity.BOTTOM or Gravity.CENTER, 0, 0)
        toast.view = LayoutInflater.from(this).inflate(R.layout.layout_custom_toast, null, false)
        toast.show()
    }

}
