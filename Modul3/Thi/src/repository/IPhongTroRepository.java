package repository;

import model.PhongTro;

import java.util.List;

public interface IPhongTroRepository {
    List<PhongTro> findAll();
    void create(PhongTro phongTro);
//    void update(int id, PhongTro user);
    void delete(int id);
    List<PhongTro> findByName(String name);
    PhongTro findPhongTroID(int id);
}
