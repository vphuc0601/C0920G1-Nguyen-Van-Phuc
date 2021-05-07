package com.example.thi.services;

import com.example.thi.entities.SanPham;

import java.util.List;

public interface SanPhamService {
    List<SanPham> findAll();

    SanPham findById(Integer id);

//    SanPham findByName(String name);

    void save(SanPham sanPham);

    void remove(Integer id);
}
