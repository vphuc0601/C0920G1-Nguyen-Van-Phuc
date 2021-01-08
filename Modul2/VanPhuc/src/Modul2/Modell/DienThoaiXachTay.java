package Modul2.Modell;

public class DienThoaiXachTay extends DienThoai {
    String quocGiaXachTay;
    String trangThai;

    public DienThoaiXachTay(String id, String tenDienThoai, String giaBan, String soLuong, String nhaSanXuat, String quocGiaXachTay, String trangThai) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "DienThoaiXachTay:" +
                " id='" + id + '\'' +
                ", tenDienThoai='" + tenDienThoai + '\'' +
                ", giaBan='" + giaBan + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", nhaSanXuat='" + nhaSanXuat + '\''+
                ",quocGiaXachTay='" + quocGiaXachTay + '\'' +
                ", trangThai='" + trangThai + '\''
                ;
    }
}
