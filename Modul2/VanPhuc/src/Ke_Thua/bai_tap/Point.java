package Ke_Thua.bai_tap;

import java.util.Arrays;

public class Point {
    float x, y;
    float [] xy= new float[2];
    public void point(float x, float y){}

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }
    public void setxy(){
        this.x=x;
        this.y=y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getxy(){
        xy[0]=this.x;
        xy[1]=this.y;
        return xy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "xy=" + Arrays.toString(xy) +
                '}';
    }
}
