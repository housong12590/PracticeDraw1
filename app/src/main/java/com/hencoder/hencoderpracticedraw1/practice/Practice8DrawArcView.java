package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    private Paint paint;

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = 250;
        int width = 400;
        int startX = getWidth() / 2 - width / 2;
        int startY = getHeight() / 2 - height / 2;
//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        RectF rectF = new RectF(startX, startY, startX + width, startY + height);
        canvas.drawArc(rectF, 250, 100, true, paint); // 绘制扇形
        canvas.drawArc(rectF, 20, 140, false, paint);

        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF, 180, 60, false,paint);
    }
}
