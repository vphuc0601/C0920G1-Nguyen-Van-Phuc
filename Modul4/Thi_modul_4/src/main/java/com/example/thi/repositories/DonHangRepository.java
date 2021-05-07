package com.example.thi.repositories;

import com.example.thi.entities.DonHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DonHangRepository extends JpaRepository<DonHang, Integer> {
    @Query("SELECT p FROM DonHang p WHERE CONCAT(p.maDonHang, p.ngayMua) LIKE %?1%")
    public Page<DonHang> search(String keyword,Pageable pageable);


}
