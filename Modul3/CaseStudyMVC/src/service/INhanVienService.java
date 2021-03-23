package service;

import model.NhanVien;

import java.util.List;

public interface INhanVienService {
    List<NhanVien> findAll();
    void create(NhanVien nhanVien);
    void update(int id, NhanVien nhanVien);
    void delete(int id);
    List<NhanVien> findByName(String name);
    NhanVien findNhanVienByID(int id);
}
