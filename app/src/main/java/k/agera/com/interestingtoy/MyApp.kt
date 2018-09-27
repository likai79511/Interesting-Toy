package k.agera.com.interestingtoy

import android.app.Application

/**
 * Created by Agera on 2018/9/27.
 */
class MyApp : Application() {

    companion object {
        lateinit var mApp: MyApp
        fun instance() = mApp
    }

    override fun onCreate() {
        super.onCreate()
        mApp = this
    }
}