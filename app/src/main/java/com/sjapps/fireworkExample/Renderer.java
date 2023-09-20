package com.sjapps.fireworkExample;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.sjapps.library.firework.Firework;

import java.util.ArrayList;
import java.util.Random;

public class Renderer extends View {

    int width = 0;
    int height = 0;
    Random r = new Random();
    ArrayList<Firework> fireworks = new ArrayList<>();
    ArrayList<Firework> removeFireworks = new ArrayList<>();

    public Renderer(Context context) {
        super(context);
    }

    public Renderer(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @SuppressLint("DrawAllocation")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (width == 0 && height == 0){
            width = this.getWidth();
            height = this.getHeight();
        }



        if (r.nextInt(50) == 4 && fireworks.size() < 2){
            fireworks.add(new Firework(r.nextInt(width),r.nextInt(height),0xFFC18B30,0xFFFFDA94));
        }

        Paint paint = new Paint();
        paint.setColor(Color.RED);

        for (Firework f : fireworks){
            f.update(canvas,paint);
            if (f.isFinished())
                removeFireworks.add(f);
        }


        fireworks.removeAll(removeFireworks);

        removeFireworks.clear();
        invalidate();
    }


}
