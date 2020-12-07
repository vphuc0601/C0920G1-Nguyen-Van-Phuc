package Abstract_Interface.bai_tap;

public class Rectangle implements Resizeable {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getCircum(){
        return (this.height+this.width)*2;
    }
    public double getArea(){
        return this.width*this.height;
    }

    @Override
    public double reszie(double percent) {
        return (percent*getArea())/100;
    }
}
