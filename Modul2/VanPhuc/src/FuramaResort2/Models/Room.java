package FuramaResort2.Models;

public class Room extends Services{
    String dichvumienphi;

    public Room(String madichvu, double dientichsudung, double chiphithue, int nguoitoida, String kieuthue, String dichvumienphi) {
        super(madichvu, dientichsudung, chiphithue, nguoitoida, kieuthue);
        this.dichvumienphi = dichvumienphi;
    }

    public String getDichvumienphi() {
        return dichvumienphi;
    }

    public void setDichvumienphi(String dichvumienphi) {
        this.dichvumienphi = dichvumienphi;
    }

    @Override
    public String showInfor() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichvumienphi='" + dichvumienphi + '\'' +
                ", madichvu='" + madichvu + '\'' +
                ", dientichsudung=" + dientichsudung +
                ", chiphithue=" + chiphithue +
                ", nguoitoida=" + nguoitoida +
                ", kieuthue='" + kieuthue + '\'' +
                '}';
    }
}
