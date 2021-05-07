package com.example.thi.services;

import com.example.thi.entities.LoaiSanPham;

import java.util.List;

public interface LoaiSanPhamService {
    List<LoaiSanPham> findAll();

    LoaiSanPham findById(int id);

    void save(LoaiSanPham loaiSanPham);

    void remove(int id);
}
