package com.sjapps.library.firework;

public class Point {
    public float x;
    public float y;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void set(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point mul(float m){
        this.x *= m;
        this.y *= m;
        return this;
    }
    public void add(Point p){
        this.x += p.x;
        this.y += p.y;
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
