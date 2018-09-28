package k.agera.com.interestingtoy.Loadingbar.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import k.agera.com.interestingtoy.CommonUtils

/**
 * Created by Agera on 2018/9/27.
 */
class Pb_type_1 : View {

    var screenWidth: Int = CommonUtils.instance().getScreenSize().first

    var mPbWidth = screenWidth * 0.8
    var mPbHeight = CommonUtils.instance().dp2px(10)


    var mPaint: Paint = Paint()

    var progress = 0

    init {
        mPaint.strokeWidth = 1f
    }


    constructor(context: Context) : super(context)

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr)


    override fun onDraw(canvas: Canvas?) {
        canvas ?: return
        mPaint.color = Color.BLACK
        //draw background
        canvas.drawRect(0f, 0f, mPbWidth.toFloat(), mPbHeight, mPaint)
        //draw progress
        mPaint.color = Color.GREEN
        var pbWidth = mPbWidth.toFloat() * progress / 100
        if (pbWidth > mPbWidth)
            pbWidth = mPbWidth.toFloat()
        canvas.drawRect(0f, 0f, pbWidth, mPbHeight, mPaint)

    }


    fun setLoadingProgress(pb: Int) {
        progress = pb
        postInvalidate()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(mPbWidth.toInt(), mPbHeight.toInt())
    }

}