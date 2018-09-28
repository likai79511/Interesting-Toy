package k.agera.com.interestingtoy.Loadingbar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import k.agera.com.interestingtoy.Loadingbar.view.Pb_type_1
import k.agera.com.interestingtoy.R

class PbType1Activity : AppCompatActivity() {

    lateinit var mPb: Pb_type_1
    lateinit var mTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pb_type1)

        var view = findViewById<View>(R.id.pb)
        Log.e("---", "--${view == null}")
        mPb = findViewById(R.id.pb)
        mTv = findViewById(R.id.tv_pb)


        Thread {

            for (i in 1..100) {
                Thread.sleep(100)
                mPb.setLoadingProgress(i)
                mTv.post {
                    mTv.text = "$i%"
                }

            }

        }.start()

    }
}
