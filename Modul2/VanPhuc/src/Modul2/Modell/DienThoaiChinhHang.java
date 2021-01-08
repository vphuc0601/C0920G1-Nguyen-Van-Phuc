package Modul2.Modell;

public class DienThoaiChinhHang extends DienThoai {
    String thoiGianBaoHanh;
    String phamViBaoHanh;

    public DienThoaiChinhHang(String id, String tenDienThoai, String giaBan, String soLuong, String nhaSanXuat, String thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public String getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return "DienThoaiChinhHang:" +
                " id='" + id + '\'' +
                ", tenDienThoai='" + tenDienThoai + '\'' +
                ", giaBan='" + giaBan + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", nhaSanXuat='" + nhaSanXuat + '\''+
                ",thoiGianBaoHanh='" + thoiGianBaoHanh + '\'' +
                ", phamViBaoHanh='" + phamViBaoHanh + '\''
                ;
    }
}
