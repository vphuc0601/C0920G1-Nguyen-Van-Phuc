package Exception.bai_tap;

public class Triang {
    double a;
    double b;
    double c;

    public Triang(double a, double b, double c) throws IllegalTriangleException {
        this.a = a;
        this.b = b;
        this.c = c;
        if (this.a<=0 || this.b<=0 || this.c<=0){
            throw new IllegalTriangleException("Canh tam giac khong dung");
        }
        else if ((this.a+this.b)<this.c || (this.b+this.c)<this.a || (this.a+this.c)<this.b) {
            throw new IllegalTriangleException("Tong 2 canh tam giac phai lon hon canh con lai");
        }


    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
