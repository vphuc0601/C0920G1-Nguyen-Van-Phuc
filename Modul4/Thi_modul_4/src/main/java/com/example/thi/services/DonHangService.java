package com.example.thi.services;
import com.example.thi.entities.DonHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DonHangService {
    public Page<DonHang> search(String keyword, Pageable pageable);
    Page<DonHang> findAll(Pageable pageable);
    List<DonHang> findAll();
    void save(DonHang donHang);
    void delete(int id);
    DonHang findById(int id);
//    List<DonHang> search(String keyword , String loaiCauHoi);
}
