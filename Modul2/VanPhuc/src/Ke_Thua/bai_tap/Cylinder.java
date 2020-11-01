package Ke_Thua.bai_tap;

public class Cylinder extends Circle {
    private final double height;

    public Cylinder(double radius, String color, double height) {
        super (radius,color);
        this.height = height;
    }
    public double getVolum(){
        return getArea()*height;
    }
}



