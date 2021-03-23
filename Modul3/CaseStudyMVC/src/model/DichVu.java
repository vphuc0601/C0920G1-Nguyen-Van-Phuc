package model;

public class DichVu {
    int id;
    String tenDichVu;
    Double dienTich;
    int soTang;
    int nguoiToiDa;
    Double chiPhiThue;
    String trangThai;
    int kieuThue;
    int loaiDichVu;

    public DichVu(int id, String tenDichVu, Double dienTich, int soTang, int nguoiToiDa, Double chiPhiThue, String trangThai, int kieuThue, int loaiDichVu) {
        this.id = id;
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.soTang = soTang;
        this.nguoiToiDa = nguoiToiDa;
        this.chiPhiThue = chiPhiThue;
        this.trangThai = trangThai;
        this.kieuThue = kieuThue;
        this.loaiDichVu = loaiDichVu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public Double getDienTich() {
        return dienTich;
    }

    public void setDienTich(Double dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public int getNguoiToiDa() {
        return nguoiToiDa;
    }

    public void setNguoiToiDa(int nguoiToiDa) {
        this.nguoiToiDa = nguoiToiDa;
    }

    public Double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(Double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(int kieuThue) {
        this.kieuThue = kieuThue;
    }

    public int getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(int loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }
}
