package model;

public class KhachHang {
    int id;
    String hoten;
    String ngaySinh;
    String cmnd;
    String phone;
    String email;
    String diachi;
    String loaikhach_id;

    public KhachHang(int id, String hoten, String ngaysinh, String cmnd, String phone, String email, String diachi, String loaikhach_id) {
        this.id = id;
        this.hoten = hoten;
        this.ngaySinh = ngaysinh;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
        this.diachi = diachi;
        this.loaikhach_id = loaikhach_id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getLoaikhach_id() {
        return loaikhach_id;
    }

    public void setLoaikhach_id(String loaikhach_id) {
        this.loaikhach_id = loaikhach_id;
    }
}
