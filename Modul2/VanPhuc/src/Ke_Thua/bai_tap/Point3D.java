package Ke_Thua.bai_tap;

import java.util.Arrays;

public class Point3D extends Point2D {
    float z;
    float[] t1= new float[3];

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setxyz(float x, float y, float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public float [] getxyz(){
        t1[0]=this.x;
        t1[1]=this.y;
        t1[2]=this.z;
        return t1;
    }

    @Override
    public String toString() {
        return "Point3D:" + Arrays.toString(getxyz());
    }
}
