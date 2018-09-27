package k.agera.com.interestingtoy.Loadingbar.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import k.agera.com.interestingtoy.CommonUtils

/**
 * Created by Agera on 2018/9/27.
 */
class Pb_type_1(context: Context) : View(context) {

    var mWidth: Int = 0
    var mHeight: Float = CommonUtils.instance().dp2px(10)
    var mBgColor = Color.TRANSPARENT
    var mPbColor = Color.GREEN
    var mEdgeColor = Color.BLACK
    var mEdgeWidth:Float = CommonUtils.instance().dp2px(1)
    var mPaint:Paint = Paint()

    init {
        mWidth = (CommonUtils.instance().getScreenSize().first * 0.8).toInt()
        mPaint.color = mEdgeColor
        mPaint.strokeWidth = mHeight
    }

    override fun onDraw(canvas: Canvas?) {
//        super.onDraw(canvas)


        canvas?:return

        canvas.drawRect(0f,0f,mWidth.toFloat(),0f,mPaint)

      /*  canvas.save()

        canvas.drawRect(0f,0f,mWidth.toFloat(),0f,mPaint)

        canvas.restore()

        mPaint.color = mPbColor
        canvas.drawRect(0f,0f,mWidth.toFloat()/2,0f,mPaint)

        Log.e("---","---onDraw---${mWidth}--$mHeight")*/
    }


}