package Ke_Thua.bai_tap;

public class Circle {
    private String color;
    private double radius;

    public Circle(double radius, String color) {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }
}
