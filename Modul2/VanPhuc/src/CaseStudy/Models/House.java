package CaseStudy.Models;

public class House extends Services implements Comparable<House>{
    public House(String id,String tenDichVu, String dienTichSudung, String chiPhiThue, String soNguoiToiDa, String kieuThue) {
        super(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
    }
    String tieuChuanPhong;
    String soTang;
    String tienNghiKhac;

    public House(String id, String tenDichVu, String dienTichSudung, String chiPhiThue,
                 String soNguoiToiDa, String kieuThue, String tieuChuanPhong, String soTang, String tienNghiKhac) {
        super(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
        this.tienNghiKhac = tienNghiKhac;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    public String getTienNghiKhac() {
        return tienNghiKhac;
    }

    public void setTienNghiKhac(String tienNghiKhac) {
        this.tienNghiKhac = tienNghiKhac;
    }

    @Override
    public String toString() {
        return "House" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang='" + soTang + '\'' +
                ", tienNghiKhac='" + tienNghiKhac + '\'' +
                ", id='" + id + '\'' +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSudung='" + dienTichSudung + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soNguoiToiDa='" + soNguoiToiDa + '\'' +
                ", kieuThue='" + kieuThue + '\''
                ;
    }

    @Override public void showInfor(){

        System.out.println(toString());
    }

    @Override
    public int compareTo(House house) {
        return this.getId().compareTo(house.getId());
    }
}
