package Abstract_Interface.bai_tap;

public class Square implements Resizeable{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double getCircum(){
        return 4*this.r;
    }
    public double getArea(){
        return r*r;
    }

    @Override
    public double reszie(double percent) {
        return (percent*getArea())/100;
    }
}
