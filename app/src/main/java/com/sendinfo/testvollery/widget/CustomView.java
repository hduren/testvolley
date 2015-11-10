package com.sendinfo.testvollery.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

/**
 * Created by Administrator on 2015/11/4.
 */
public class CustomView extends View {
    public CustomView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setColor(Color.BLACK);
        paint.setTextSize(17);
        int x=0;
        while(x<=1000){
//            Log.e("print",x+"");
            canvas.drawLine(0, x, 500, x, paint);
            x+=30;
            canvas.drawLine(0,x,500,x,paint);
            x+=123;
        }
    }
}
