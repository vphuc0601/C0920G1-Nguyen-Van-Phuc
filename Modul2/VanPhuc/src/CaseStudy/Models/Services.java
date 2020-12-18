package CaseStudy.Models;

public abstract class Services {
    String id;
    String tenDichVu;
    String dienTichSudung;
    String chiPhiThue;
    String soNguoiToiDa;
    String kieuThue;


    public Services() {

    }

    public  abstract void showInfor();


    public Services(String id, String tenDichVu, String dienTichSudung, String chiPhiThue, String soNguoiToiDa, String kieuThue) {
        this.id = id;
        this.tenDichVu = tenDichVu;
        this.dienTichSudung = dienTichSudung;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = soNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDichVu(){ return tenDichVu;}

    public void setTenDichVu(){this.tenDichVu= tenDichVu;}

    public String getDienTichSudung() {
        return dienTichSudung;
    }

    public void setDienTichSudung(String dienTichSudung) {
        this.dienTichSudung = dienTichSudung;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(String soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", tenDichVu='"+ tenDichVu+'\'' +
                ", dienTichSudung='" + dienTichSudung + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soNguoiToiDa='" + soNguoiToiDa + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

}
