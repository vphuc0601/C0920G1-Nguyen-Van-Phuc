package ThiModul2;

public class SoTietKiem {
    String maSo;
    String maKh;
    String ngayMoSo;
    String thoiGianBatDauGui;
    String soTien;
    String laiSuat;

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getNgayMoSo() {
        return ngayMoSo;
    }

    public void setNgayMoSo(String ngayMoSo) {
        this.ngayMoSo = ngayMoSo;
    }

    public String getThoiGianBatDauGui() {
        return thoiGianBatDauGui;
    }

    public void setThoiGianBatDauGui(String thoiGianBatDauGui) {
        this.thoiGianBatDauGui = thoiGianBatDauGui;
    }

    public String getSoTien() {
        return soTien;
    }

    public void setSoTien(String soTien) {
        this.soTien = soTien;
    }

    public String getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(String laiSuat) {
        this.laiSuat = laiSuat;
    }

    public SoTietKiem(String maSo, String maKh, String ngayMoSo, String thoiGianBatDauGui, String soTien, String laiSuat) {
        this.maSo = maSo;
        this.maKh = maKh;
        this.ngayMoSo = ngayMoSo;
        this.thoiGianBatDauGui = thoiGianBatDauGui;
        this.soTien = soTien;
        this.laiSuat = laiSuat;
    }

    @Override
    public String toString() {
        return "SoTietKiem{" +
                "maSo='" + maSo + '\'' +
                ", maKh='" + maKh + '\'' +
                ", ngayMoSo='" + ngayMoSo + '\'' +
                ", thoiGianBatDauGui='" + thoiGianBatDauGui + '\'' +
                ", soTien='" + soTien + '\'' +
                ", laiSuat='" + laiSuat + '\'' +
                '}';
    }
}
