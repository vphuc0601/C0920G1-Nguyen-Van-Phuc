package CaseStudy.Models;

public class Villa extends Services implements Comparable<Villa>{
    String dienTichHoBoi;
    String tieuChuanPhong;
    String soTang;
    String tienNghiKhac;


    public Villa(String id, String tenDichVu,String dienTichSudung, String chiPhiThue, String soNguoiToiDa,
                 String kieuThue, String tieuChuanPhong, String tienNghiKhac, String soTang, String dienTichHoBoi) {
        super(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.tienNghiKhac = tienNghiKhac;
        this.soTang = soTang;
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public String getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(String dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
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
        return "Villa: " +
                "id='" + id + '\'' +
                ",dienTichHoBoi='" + dienTichHoBoi + '\'' +
                ", tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang='" + soTang + '\'' +
                ", tienNghiKhac='" + tienNghiKhac + '\'' +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSudung='" + dienTichSudung + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soNguoiToiDa='" + soNguoiToiDa + '\'' +
                ", kieuThue='" + kieuThue + '\'' ;
    }

    @Override public void showInfor(){
        System.out.println(toString());
    }

    @Override
    public int compareTo(Villa villa) {
        return this.getId().compareTo(villa.getId());
    }
}
