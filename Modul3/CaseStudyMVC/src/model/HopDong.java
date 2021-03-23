package model;

public class HopDong {
    int id;
    int nhanvien_id;
    int khachhang_id;
    int dichvu_id;
    int hopdong_id;
    String ngayLamHopDong;
    String ngayKetThuc;
    double tienCoc;
    double tongTien;

    public HopDong(int id, int nhanvien_id, int khachhang_id, int dichvu_id, int hopdong_id, String ngayLamHopDong, String ngayKetThuc, double tienCoc, double tongTien) {
        this.id = id;
        this.nhanvien_id = nhanvien_id;
        this.khachhang_id = khachhang_id;
        this.dichvu_id = dichvu_id;
        this.hopdong_id = hopdong_id;
        this.ngayLamHopDong = ngayLamHopDong;
        this.ngayKetThuc = ngayKetThuc;
        this.tienCoc = tienCoc;
        this.tongTien = tongTien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNhanvien_id() {
        return nhanvien_id;
    }

    public void setNhanvien_id(int nhanvien_id) {
        this.nhanvien_id = nhanvien_id;
    }

    public int getKhachhang_id() {
        return khachhang_id;
    }

    public void setKhachhang_id(int khachhang_id) {
        this.khachhang_id = khachhang_id;
    }

    public int getDichvu_id() {
        return dichvu_id;
    }

    public void setDichvu_id(int dichvu_id) {
        this.dichvu_id = dichvu_id;
    }

    public int getHopdong_id() {
        return hopdong_id;
    }

    public void setHopdong_id(int hopdong_id) {
        this.hopdong_id = hopdong_id;
    }

    public String getNgayLamHopDong() {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong(String ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public double getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(double tienCoc) {
        this.tienCoc = tienCoc;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
}
