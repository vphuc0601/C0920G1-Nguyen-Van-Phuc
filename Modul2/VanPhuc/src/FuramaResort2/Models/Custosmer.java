package FuramaResort2.Models;

public class Custosmer extends Services {
    String hoten;
    String ngaysinh;
    String gioitinh;
    String cmnd;
    String phone;
    String email;
    String loaikhach;
    String diachi;

    public Custosmer(String hoten, String ngaysinh, String gioitinh, String cmnd, String phone, String email, String loaikhach, String diachi) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
        this.loaikhach = loaikhach;
        this.diachi = diachi;
    }

    public Custosmer() {

    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
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

    public String getLoaikhach() {
        return loaikhach;
    }

    public void setLoaikhach(String loaikhach) {
        this.loaikhach = loaikhach;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String showInfor() {
        return toString();
    }


    @Override
    public String toString() {
        return "Custosmer{" +
                "hoten='" + hoten + '\'' +
                ", ngaysinh='" + ngaysinh + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", loaikhach='" + loaikhach + '\'' +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}

