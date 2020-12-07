package FuramaResort2.Models;

public class House extends Services{
    String tieuchuanphong;
    String tiennghikhac;
    int sotang;

    public House(String madichvu, double dientichsudung, double chiphithue, int nguoitoida, String kieuthue, String tieuchuanphong, String tiennghikhac, int sotang) {
        super(madichvu, dientichsudung, chiphithue, nguoitoida, kieuthue);
        this.tieuchuanphong = tieuchuanphong;
        this.tiennghikhac = tiennghikhac;
        this.sotang = sotang;
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

    public int getSotang() {
        return sotang;
    }

    public void setSotang(int sotang) {
        this.sotang = sotang;
    }

    @Override
    public String showInfor() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuchuanphong='" + tieuchuanphong + '\'' +
                ", tiennghikhac='" + tiennghikhac + '\'' +
                ", sotang=" + sotang +
                ", madichvu='" + madichvu + '\'' +
                ", dientichsudung=" + dientichsudung +
                ", chiphithue=" + chiphithue +
                ", nguoitoida=" + nguoitoida +
                ", kieuthue='" + kieuthue + '\'' +
                '}';
    }
}
