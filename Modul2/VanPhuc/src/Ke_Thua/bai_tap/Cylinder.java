package Ke_Thua.bai_tap;

public class Cylinder extends Circle {
    private final double height ;

    public Cylinder(double radius, String color, double height){
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getCapacity(){
        return this.height*super.area();
    }

    @Override
    public String toString() {
        return   "Chiều cao của Cylinder:"
                +getHeight()
                +"\n Thể tích: "
                +getCapacity()
                +"\n Ban kinh"
                +getRadius();
    }
}
