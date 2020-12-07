package Abstract_Interface.bai_tap;

public class Circle implements Resizeable {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getCircum(){
        return Math.PI*2*this.radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double reszie(double percent) {
        return (percent*getArea()/100);
    }
}
