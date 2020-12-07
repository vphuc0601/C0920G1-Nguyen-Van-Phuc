package FuramaResort2.Models;

public class Villa extends Services {
    String tieuchuanphong;
    String tiennghikhac;
    int sotang;
    double dientichhoboi;


    public Villa(String madichvu, double dientichsudung, double chiphithue, int nguoitoida, String kieuthue, String tieuchuanphong, String tiennghikhac, int sotang, double dientichhoboi) {
        super(madichvu, dientichsudung, chiphithue, nguoitoida, kieuthue);
        this.tieuchuanphong = tieuchuanphong;
        this.tiennghikhac = tiennghikhac;
        this.sotang= sotang;
        this.dientichhoboi = dientichhoboi;
    }


    public String getTieuchuanphong() {
        return tieuchuanphong;
    }

    public void setTieuchuanphong(String tieuchuanphong) {
        this.tieuchuanphong = tieuchuanphong;
    }

    public String getTiennghikhac() {
        return tiennghikhac;
    }

    public void setTiennghikhac(String tiennghikhac) {
        this.tiennghikhac = tiennghikhac;
    }

    public double getSotang() {
        return sotang;
    }

    public void setSotang(int sotang) {
        this.sotang = sotang;
    }

    public double getDientichhoboi() {
        return dientichhoboi;
    }

    public void setDientichhoboi(double dientichhoboi) {
        this.dientichhoboi = dientichhoboi;
    }

    @Override
    public String showInfor() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieuchuanphong='" + tieuchuanphong + '\'' +
                ", tiennghikhac='" + tiennghikhac + '\'' +
                ", sotang=" + sotang +
                ", dientichhoboi=" + dientichhoboi +
                ", madichvu='" + madichvu + '\'' +
                ", dientichsudung=" + dientichsudung +
                ", chiphithue=" + chiphithue +
                ", nguoitoida=" + nguoitoida +
                ", kieuthue='" + kieuthue + '\'' +
                '}';
    }
}
