package com.sjapps.library.firework;

import android.graphics.Canvas;
import android.graphics.Paint;

import androidx.annotation.ColorInt;

import java.util.ArrayList;

public class Firework {

    ArrayList<Line> lines = new ArrayList<>();
    boolean isActive;
    boolean isFinished;
    float x;
    float y;
    int color1;
    int color2;
    int lineNum = 30;

    public Firework(float x, float y, @ColorInt int color){
        this(x,y,color,-1);
    }


    public Firework(float x, float y, @ColorInt int color1, @ColorInt int color2){
        this.x = x;
        this.y = y;
        this.color1 = color1;
        this.color2 = color2;
        create();
    }

    public void update(Canvas canvas, Paint paint){
//        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);

        for (Line l : lines){
            l.update();
            l.draw(canvas,paint);
        }

        if (!lines.isEmpty() && lines.get(0).isFinish()){
            lines.clear();
            isFinished = true;
        }


    }

    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }

    public boolean isFinished() {
        return isFinished;
    }

    //    0xFFC18B30:0xFFFFDA94
    void create(){
        Point point = new Point(x,y);
        for(int i = 0; i < lineNum; i++) {
            Line p = new Line(new Point(point.x,point.y),range(lineNum,i),(color2!=-1? (i%2==0?color1:color2):color1),(i%2==0?0:15));
            lines.add(p);
        }
    }

    float range(float max, float v) {
        return (float) (v * (Math.PI *2) / max);
    }

}
