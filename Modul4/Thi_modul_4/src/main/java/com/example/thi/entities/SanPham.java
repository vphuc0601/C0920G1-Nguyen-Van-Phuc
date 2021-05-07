package com.example.thi.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "san_pham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "VARCHAR(255)")
    private String tenSanPham;

    @Column(columnDefinition = "DOUBLE")
    private String giaSanPham;

    @Column(columnDefinition = "VARCHAR(255)")
    private String tinhTrang;

    @ManyToOne
    @JoinColumn(name = "loai_san_pham_id")
    private LoaiSanPham loaiSanPham;

    @ManyToOne
    @JoinColumn(name = "don_hang_id")
    private DonHang donHang;

    public SanPham(LoaiSanPham loaiSanPham, DonHang donHang) {
        this.loaiSanPham = loaiSanPham;
        this.donHang = donHang;
    }

    public SanPham(Integer id, String tenSanPham, String giaSanPham, String tinhTrang, LoaiSanPham loaiSanPham, DonHang donHang) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
        this.tinhTrang = tinhTrang;
        this.loaiSanPham = loaiSanPham;
        this.donHang = donHang;
    }

    public SanPham() {
    }
}
