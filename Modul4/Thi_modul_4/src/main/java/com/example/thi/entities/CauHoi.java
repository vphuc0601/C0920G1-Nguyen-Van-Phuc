//package com.example.thi.entities;
//
//
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.format.annotation.DateTimeFormat;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Past;
//import javax.validation.constraints.Size;
//import java.util.Date;
//@Getter
//@Setter
//@Entity(name = "cauHoi")
//public class CauHoi {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int idCauHoi;
//    @NotBlank(message = "Không được bỏ trống")
//    @Size(min = 5 , max = 100 , message = "Trên 5 kí tự và dưới 100 ký tự")
//    private String tieuDe;
//    @NotBlank(message = "Không được bỏ trống")
//    private String loaiCauHoi;
//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
//    @Past
//    private Date ngayDang;
//    private String tinhTrang;
//
//    @ManyToOne
//    @JoinColumn(name = "id_nguoi_hoi", nullable = false)
//    private NguoiHoi nguoiHoi;
//
//    public NguoiDap getNguoiDap() {
//        return nguoiDap;
//    }
//
//    public void setNguoiDap(NguoiDap nguoiDap) {
//        this.nguoiDap = nguoiDap;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "id_nguoi_dap", nullable = false)
//    private NguoiDap nguoiDap;
//
//    public CauHoi() {
//    }
//}
