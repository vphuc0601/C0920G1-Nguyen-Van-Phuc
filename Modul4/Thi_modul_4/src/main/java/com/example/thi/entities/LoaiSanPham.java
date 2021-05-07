package com.example.thi.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
//@Table(name = "loai_san_pham")
public class LoaiSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "VARCHAR(255)")
    private String ten;

    @OneToMany(mappedBy = "loaiSanPham")
    private Set<SanPham> sanPhams;

    public LoaiSanPham() {
    }

    public LoaiSanPham(Set<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }
}
