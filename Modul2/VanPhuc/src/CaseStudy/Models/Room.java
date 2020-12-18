package CaseStudy.Models;

public class Room extends Services{

    String dichVuMienPhi;

    public Room(String id, String tenDichVu, String dienTichSudung, String chiPhiThue,
                String soNguoiToiDa, String kieuThue, String dichVuMienPhi) {
        super(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }
    @Override public void  showInfor(){
        System.out.println(toString());;
    }

    @Override
    public String toString() {
        return "Room" +
                "id='" + id + '\'' +
                ", dienTichSudung='" + dienTichSudung + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soNguoiToiDa='" + soNguoiToiDa + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                ", dichVuMienPhi='" + dichVuMienPhi;
    }
}
