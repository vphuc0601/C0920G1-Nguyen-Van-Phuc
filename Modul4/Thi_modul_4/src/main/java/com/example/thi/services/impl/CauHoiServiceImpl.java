//package com.example.thi.services.impl;
//
//import com.example.thi.entities.CauHoi;
//import com.example.thi.repositories.CauHoiRepository;
//import com.example.thi.services.CauHoiService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//@Service
//public class CauHoiServiceImpl implements CauHoiService {
//    @Autowired
//    CauHoiRepository cauHoiRepository;
//
//    @Override
//    public Page<CauHoi> findAll(Pageable pageable) {
//        return cauHoiRepository.findAll(pageable);
//    }
//
//    @Override
//    public List<CauHoi> findAll() {
//        return cauHoiRepository.findAll();
//    }
//
//    @Override
//    public void save(CauHoi cauHoi) {
//        cauHoiRepository.save(cauHoi);
//    }
//
//    @Override
//    public void delete(int id) {
//        cauHoiRepository.deleteById(id);
//    }
//
//    @Override
//    public CauHoi findById(int id) {
//        return cauHoiRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public List<CauHoi> search(String tieuDe, String loaiCauHoi) {
//        return cauHoiRepository.search(tieuDe, loaiCauHoi);
//    }
//}
