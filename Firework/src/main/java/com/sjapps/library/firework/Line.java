package com.sjapps.library.firework;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;

import androidx.annotation.ColorInt;

public class Line {

    Point pos;
    float angle;
    float dx = 10;
    Point target;
    private int alpha = 255;
    int time =0;
    private boolean finish;
    int color;
    int l;
    float speed = 3;

    public Line(Point pos, float angle, @ColorInt int color, int l){
        this.pos = pos;
        this.angle = angle;
        this.color = color;
        dx += l;
        this.l = l;
    }


    public void update(){
        target = fromAngle(angle);
        target.mul(dx);
        dx += speed;
        pos.add(fromAngle(angle).mul(speed * .1f));
        if (time > 200 && alpha > 0){
            alpha -=5;
        }
        time+= speed;
        if (alpha <= 0)
            finish = true;
    }

    public void draw(Canvas canvas, Paint paint){

        paint.setColor(color);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAlpha(alpha);
        Shader shader = new LinearGradient(pos.x, pos.y,pos.x + target.x, pos.y + target.y,  0x0fffffff,  color, Shader.TileMode.CLAMP);
        paint.setShader(shader);

        canvas.drawLine(pos.x,pos.y,pos.x + target.x, pos.y + target.y,paint);
    }

    public boolean isFinish() {
        return finish;
    }

    public static Point fromAngle(float angle) {
        return new Point((float) Math.cos(angle), (float) Math.sin(angle));
    }

}
