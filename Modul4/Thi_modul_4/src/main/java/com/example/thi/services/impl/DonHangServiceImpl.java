package com.example.thi.services.impl;

import com.example.thi.entities.DonHang;
import com.example.thi.repositories.DonHangRepository;
import com.example.thi.services.DonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DonHangServiceImpl implements DonHangService {
    @Autowired
    private DonHangRepository donHangRepository;

    @Override
    public Page<DonHang> search(String keyword, Pageable pageable) {
        return donHangRepository.search(keyword,pageable);
    }

    @Override
    public Page<DonHang> findAll(Pageable pageable) {
        return donHangRepository.findAll(pageable);
    }

    @Override
    public List<DonHang> findAll() {
        return donHangRepository.findAll();
    }

    @Override
    public void save(DonHang donHang) {
        donHangRepository.save(donHang);
    }

    @Override
    public void delete(int id) {
        donHangRepository.deleteById(id);
    }

    @Override
    public DonHang findById(int id) {
        return donHangRepository.findById(id).orElse(null);
    }
}
