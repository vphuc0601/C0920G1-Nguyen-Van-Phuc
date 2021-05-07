package com.example.thi.services.impl;

import com.example.thi.entities.SanPham;
import com.example.thi.repositories.SanPhamRepository;
import com.example.thi.services.SanPhamService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    private SanPhamRepository sanPhamRepository;
    @Override
    public List<SanPham> findAll() {
        return sanPhamRepository.findAll();
    }

    @Override
    public SanPham findById(Integer id) {
        return sanPhamRepository.findById(id).orElse(null);
    }

    @Override
    public void save(SanPham sanPham) {
        sanPhamRepository.save(sanPham);
    }

    @Override
    public void remove(Integer id) {
        sanPhamRepository.deleteById(id);
    }
}
