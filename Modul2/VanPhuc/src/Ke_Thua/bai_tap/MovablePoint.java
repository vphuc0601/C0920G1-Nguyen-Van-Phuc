package Ke_Thua.bai_tap;

import java.util.Arrays;

public class MovablePoint extends Point {
    float xSpeed, ySpeed;
    float [] Speed= new float[2];

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x,float y, float xSpeed, float ySpeed){}

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void getSpeed(float xSpeed, float ySpeed) {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float [] setSpeed(){
        Speed[0]=xSpeed;
        Speed[1]=ySpeed;
        return Speed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", Speed=" + Arrays.toString(setSpeed()) +
                '}';
    }
    public void move(){
        x+=xSpeed;
        y+=ySpeed;
        return;
    }
}
