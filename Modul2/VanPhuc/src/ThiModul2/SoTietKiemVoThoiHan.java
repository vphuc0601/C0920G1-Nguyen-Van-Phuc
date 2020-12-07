package ThiModul2;

public class SoTietKiemVoThoiHan extends SoTietKiem{

    public SoTietKiemVoThoiHan(String maSo, String maKh, String ngayMoSo, String thoiGianBatDauGui, String soTien, String laiSuat) {
        super(maSo, maKh, ngayMoSo, thoiGianBatDauGui, soTien, laiSuat);
    }

    @Override
    public String toString() {
        return "SoTietKiemVoThoiHan{" +
                "maSo='" + maSo + '\'' +
                ", maKh='" + maKh + '\'' +
                ", ngayMoSo='" + ngayMoSo + '\'' +
                ", thoiGianBatDauGui='" + thoiGianBatDauGui + '\'' +
                ", soTien='" + soTien + '\'' +
                ", laiSuat='" + laiSuat + '\'' +
                '}';
    }
}
