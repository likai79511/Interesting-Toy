package k.agera.com.interestingtoy

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import k.agera.com.interestingtoy.Alert.AlartActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initEvents()
    }

    fun initEvents() {
        findViewById<View>(R.id.btn_alert).setOnClickListener(this)
        findViewById<View>(R.id.btn_dialog).setOnClickListener(this)
        findViewById<View>(R.id.btn_loadingbar).setOnClickListener(this)
        findViewById<View>(R.id.btn_pulltorefresh).setOnClickListener(this)
        findViewById<View>(R.id.btn_navigateview).setOnClickListener(this)
        findViewById<View>(R.id.btn_materialdesign).setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        v ?: return
        var intent: Intent? = null

        when (v.id) {

            R.id.btn_alert -> {
                intent = Intent(this@MainActivity, AlartActivity::class.java)
            }
        }
        intent?.let {
            startActivity(it)
        }
    }

}
