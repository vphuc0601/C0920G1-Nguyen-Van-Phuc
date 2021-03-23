package model;

public class NhanVien {
    int id;
    String hoten;
    String vitri_id;
    String trinhdo_id;
    String bophan_id;
    String ngaySinh;
    String cmnd;
    String luong;
    String email;
    String diachi;
    String username;
    String ma_nhanvien;

    public NhanVien(String hoten, String vitri_id, String trinhdo_id, String bophan_id, String ngaySinh, String cmnd, String luong, String email, String diachi, String username, String ma_nhanvien) {
        this.hoten = hoten;
        this.vitri_id = vitri_id;
        this.trinhdo_id = trinhdo_id;
        this.bophan_id = bophan_id;
        this.ngaySinh = ngaySinh;
        this.cmnd = cmnd;
        this.luong = luong;
        this.email = email;
        this.diachi = diachi;
        this.username = username;
        this.ma_nhanvien = ma_nhanvien;
    }

    public NhanVien(int id, String hoten, String vitri_id, String trinhdo_id, String bophan_id, String ngaySinh, String cmnd, String luong, String email, String diachi, String username, String ma_nhanvien) {
        this.id = id;
        this.hoten = hoten;
        this.vitri_id = vitri_id;
        this.trinhdo_id = trinhdo_id;
        this.bophan_id = bophan_id;
        this.ngaySinh = ngaySinh;
        this.cmnd = cmnd;
        this.luong = luong;
        this.email = email;
        this.diachi = diachi;
        this.username = username;
        this.ma_nhanvien = ma_nhanvien;
    }

    public NhanVien(String hoten, String vitri_id, String trinhdo_id, String bophan_id, String ngaySinh, String cmnd, String luong, String email, String diachi, String ma_nhanvien) {
        this.hoten = hoten;
        this.vitri_id = vitri_id;
        this.trinhdo_id = trinhdo_id;
        this.bophan_id = bophan_id;
        this.ngaySinh = ngaySinh;
        this.cmnd = cmnd;
        this.luong = luong;
        this.email = email;
        this.diachi = diachi;
        this.ma_nhanvien = ma_nhanvien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getVitri_id() {
        return vitri_id;
    }

    public void setVitri_id(String vitri_id) {
        this.vitri_id = vitri_id;
    }

    public String getTrinhdo_id() {
        return trinhdo_id;
    }

    public void setTrinhdo_id(String trinhdo_id) {
        this.trinhdo_id = trinhdo_id;
    }

    public String getBophan_id() {
        return bophan_id;
    }

    public void setBophan_id(String bophan_id) {
        this.bophan_id = bophan_id;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMa_nhanvien() {
        return ma_nhanvien;
    }

    public void setMa_nhanvien(String ma_nhanvien) {
        this.ma_nhanvien = ma_nhanvien;
    }
}
