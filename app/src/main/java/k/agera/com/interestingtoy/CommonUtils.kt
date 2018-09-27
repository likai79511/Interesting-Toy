package k.agera.com.interestingtoy

import android.content.Context
import android.util.DisplayMetrics
import android.util.TypedValue
import android.view.WindowManager

/**
 * Created by Agera on 2018/9/27.
 */
class CommonUtils private constructor() {

    companion object {
        private var utils = CommonUtils()

        fun instance() = utils
    }


    fun getScreenSize(): Pair<Int, Int> {
        var wm = MyApp.instance().getSystemService(Context.WINDOW_SERVICE) as WindowManager
        var metrics = DisplayMetrics()
        wm.defaultDisplay.getMetrics(metrics)
        return Pair(metrics.widthPixels, metrics.heightPixels)
    }

    fun dp2px(dp:Int):Float{
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp.toFloat(),MyApp.instance().resources.displayMetrics)
    }
}