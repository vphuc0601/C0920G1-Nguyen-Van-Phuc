package service;

import model.NhanVien;
import repository.INhanVienRepository;
import repository.NhanVienRepositoryImpl;

import java.util.List;

public class NhanVienServiceImpl implements INhanVienService {
INhanVienRepository nhanVienRepository=new NhanVienRepositoryImpl();
    @Override
    public List<NhanVien> findAll() {
        return nhanVienRepository.findAll();
    }

    @Override
    public void create(NhanVien nhanVien) {
         nhanVienRepository.create(nhanVien);
    }

    @Override
    public void update(int id, NhanVien nhanVien) {
        nhanVienRepository.update(id, nhanVien);
    }

    @Override
    public void delete(int id) {
        nhanVienRepository.delete(id);
    }

    @Override
    public List<NhanVien> findByName(String hoten) {
        return nhanVienRepository.findByName(hoten);
    }

    @Override
    public NhanVien findNhanVienByID(int id) {
       return nhanVienRepository.findNhanVienByID(id);
    }
}
