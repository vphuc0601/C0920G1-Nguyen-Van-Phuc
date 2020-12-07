package Ke_Thua.bai_tap;

import java.util.Arrays;

public class Point2D {
    float x;
    float y;
    float [] t= new float[2];

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
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

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }



    public float[] getxy(){
        t[0]=this.x;
        t[1]=this.y;
        return t;
    }

    @Override
    public String toString() {
        return "Point2D{" + Arrays.toString(getxy()) +
                '}';
    }
}
