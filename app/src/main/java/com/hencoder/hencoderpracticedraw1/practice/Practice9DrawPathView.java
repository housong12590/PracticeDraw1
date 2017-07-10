package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    private Paint paint;
    private Path path = new Path();

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);

    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        int radius = 200;
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        RectF rectF = new RectF(centerX - radius, centerY - radius, centerX, centerY);
        path.addArc(rectF, -225, 225);
        path.arcTo(new RectF(centerX, centerY - radius, centerX + radius, centerY), -180, 225, false);
        path.lineTo(centerX, (float) (centerY + radius /1.5));
        canvas.drawPath(path, paint);
    }
}
