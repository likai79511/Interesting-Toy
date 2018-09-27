package k.agera.com.interestingtoy.Loadingbar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout
import k.agera.com.interestingtoy.Loadingbar.view.Pb_type_1
import k.agera.com.interestingtoy.R

class LoadingbarActivity : AppCompatActivity(), View.OnClickListener {


    lateinit var mArea: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loadingbar)
        mArea = findViewById<FrameLayout>(R.id.fl_show)
        initEvents()
    }

    fun initEvents() {
        findViewById<View>(R.id.btn_type1).setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        v ?: return

        when (v.id) {
            R.id.btn_type1 -> {
               showType1()
            }
        }

    }


    fun showType1(){
        mArea.removeAllViews()
        var view = Pb_type_1(this@LoadingbarActivity)
        var lp = LinearLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,FrameLayout.LayoutParams.MATCH_PARENT)
        lp.gravity = Gravity.CENTER
        view.layoutParams = lp
        mArea.addView(view)
    }
}
