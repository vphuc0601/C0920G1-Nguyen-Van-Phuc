package com.example.thi.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="don_hang")
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(columnDefinition = "INT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maDonHang;

    @Column(columnDefinition = "DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngayMua;

    @Column(columnDefinition = "DOUBLE")
    private Double soLuong;

    @OneToMany(mappedBy = "donHang")
    private Set<SanPham> sanPhams;

    public DonHang() {
    }


    //    @OneToMany(mappedBy = "id")
//    private Set<SanPham> sanPhams;

    public DonHang(Set<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }
}
