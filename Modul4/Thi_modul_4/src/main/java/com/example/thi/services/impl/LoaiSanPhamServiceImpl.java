package com.example.thi.services.impl;

import com.example.thi.entities.LoaiSanPham;
import com.example.thi.repositories.LoaiSanPhamRepository;
import com.example.thi.services.LoaiSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiSanPhamServiceImpl implements LoaiSanPhamService {
    @Autowired
    private LoaiSanPhamRepository loaiSanPhamRepository;
    @Override
    public List<LoaiSanPham> findAll() {
        return loaiSanPhamRepository.findAll();
    }

    @Override
    public LoaiSanPham findById(int id) {
        return loaiSanPhamRepository.findById(id).orElse(null);
    }

    @Override
    public void save(LoaiSanPham loaiSanPham) {
        loaiSanPhamRepository.save(loaiSanPham);
    }

    @Override
    public void remove(int id) {

    }
}
