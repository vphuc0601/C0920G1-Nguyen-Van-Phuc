package FuramaResort2.Models;



public abstract class Services {

    String madichvu;
    double dientichsudung;
    double chiphithue;
    int nguoitoida;
    String kieuthue;



    public Services(String madichvu, double dientichsudung, double chiphithue, int nguoitoida, String kieuthue) {
        this.madichvu=madichvu;
        this.dientichsudung = dientichsudung;
        this.chiphithue = chiphithue;
        this.nguoitoida = nguoitoida;
        this.kieuthue = kieuthue;

    }

    public Services() {

    }


    public String getMadichvu() {
        return madichvu;
    }

    public void setTendichvu(String tendichvu) {
        this.madichvu = madichvu;
    }

    public double getDientichsudung() {
        return dientichsudung;
    }

    public void setDientichsudung(double dientichsudung) {
        this.dientichsudung = dientichsudung;
    }

    public double getChiphithue() {
        return chiphithue;
    }

    public void setChiphithue(double chiphithue) {
        this.chiphithue = chiphithue;
    }

    public int getNguoitoida() {
        return nguoitoida;
    }

    public void setNguoitoida(int nguoitoida) {
        this.nguoitoida = nguoitoida;
    }

    public String getKieuthue() {
        return kieuthue;
    }

    public void setKieuthue(String kieuthue) {
        this.kieuthue = kieuthue;
    }

    public abstract String showInfor();

    @Override
    public String toString() {
        return "Services{" +
                "madichvu='" + madichvu + '\'' +
                ", dientichsudung=" + dientichsudung +
                ", chiphithue=" + chiphithue +
                ", nguoitoida=" + nguoitoida +
                ", kieuthue='" + kieuthue + '\'' +
                '}';
    }
}
