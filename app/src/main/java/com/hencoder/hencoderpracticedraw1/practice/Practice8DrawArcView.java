package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    private Paint mPaint = new Paint();

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setAntiAlias(true);
        canvas.drawArc(200f, 200f, 500f, 400f,  240f, 110f, true, mPaint);
        canvas.drawArc(200f, 200f, 500f, 400f,  20f, 140f, false, mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(200f, 200f, 500f, 400f,  180f, 50f, false, mPaint);
//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
    }
}
