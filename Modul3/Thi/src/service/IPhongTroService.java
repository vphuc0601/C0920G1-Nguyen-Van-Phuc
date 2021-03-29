package service;

import model.PhongTro;

import java.util.List;

public interface IPhongTroService {
    List<PhongTro> findAll();
    void create(PhongTro user);
    void update(int id, PhongTro user);
    void delete(int id);
    List<PhongTro> findByName(String name);
    PhongTro findUserID(int id);
}
