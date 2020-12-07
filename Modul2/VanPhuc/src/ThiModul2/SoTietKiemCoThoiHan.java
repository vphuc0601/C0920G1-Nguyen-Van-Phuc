package ThiModul2;

public class SoTietKiemCoThoiHan extends  SoTietKiem{
    String kyHan;

    public SoTietKiemCoThoiHan(String maSo, String maKh, String ngayMoSo, String thoiGianBatDauGui, String soTien, String laiSuat, String kyHan) {
        super(maSo, maKh, ngayMoSo, thoiGianBatDauGui, soTien, laiSuat);
        this.kyHan = kyHan;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public String toString() {
        return "SoTietKiemCoThoiHan{" +
                "kyHan='" + kyHan + '\'' +
                ", maSo='" + maSo + '\'' +
                ", maKh='" + maKh + '\'' +
                ", ngayMoSo='" + ngayMoSo + '\'' +
                ", thoiGianBatDauGui='" + thoiGianBatDauGui + '\'' +
                ", soTien='" + soTien + '\'' +
                ", laiSuat='" + laiSuat + '\'' +
                '}';
    }
}
