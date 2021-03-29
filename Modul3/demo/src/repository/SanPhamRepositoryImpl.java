package repository;

import model.NhanVien;
import model.SanPham;

import java.util.List;

public class SanPhamRepositoryImpl implements ISanPhamRepository {
    @Override
    public List<SanPham> findAll() {
        return null;
    }

    @Override
    public void create(SanPham sanPham) {

    }

    @Override
    public void update(int id, SanPham sanPham) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<SanPham> findByName(String name) {
        return null;
    }

    @Override
    public NhanVien findSanPhamByID(int id) {
        return null;
    }
}
