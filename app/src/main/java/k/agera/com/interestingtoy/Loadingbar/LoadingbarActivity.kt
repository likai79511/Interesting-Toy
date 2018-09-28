package k.agera.com.interestingtoy.Loadingbar

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import k.agera.com.interestingtoy.R

class LoadingbarActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loadingbar)
        initEvents()
    }

    fun initEvents() {
        findViewById<View>(R.id.btn_type1).setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        v ?: return

        when (v.id) {

            R.id.btn_type1 -> {
                startActivity(Intent(this@LoadingbarActivity, PbType1Activity::class.java))
            }


        }

    }


}
