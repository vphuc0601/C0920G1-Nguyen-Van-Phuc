package ThiModul2;

public class SoTietKiemDaiHan extends SoTietKiem{
    String kyHan;
    String uuDai;

    public SoTietKiemDaiHan(String maSo, String maKh, String ngayMoSo, String thoiGianBatDauGui, String soTien, String laiSuat, String kyHan, String uuDai) {
        super(maSo, maKh, ngayMoSo, thoiGianBatDauGui, soTien, laiSuat);
        this.kyHan = kyHan;
        this.uuDai = uuDai;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    public String getUuDai() {
        return uuDai;
    }

    public void setUuDai(String uuDai) {
        this.uuDai = uuDai;
    }

    @Override
    public String toString() {
        return "SoTietKiemDaiHan{" +
                "kyHan='" + kyHan + '\'' +
                ", uuDai='" + uuDai + '\'' +
                ", maSo='" + maSo + '\'' +
                ", maKh='" + maKh + '\'' +
                ", ngayMoSo='" + ngayMoSo + '\'' +
                ", thoiGianBatDauGui='" + thoiGianBatDauGui + '\'' +
                ", soTien='" + soTien + '\'' +
                ", laiSuat='" + laiSuat + '\'' +
                '}';
    }
}
