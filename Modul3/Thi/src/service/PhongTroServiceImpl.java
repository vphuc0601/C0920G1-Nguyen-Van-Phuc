package service;

import model.PhongTro;
import repository.IPhongTroRepository;
import repository.PhongTroRrepositoryImpl;

import java.util.List;

public class PhongTroServiceImpl implements IPhongTroService {
    private IPhongTroRepository phongTroRrepository =new PhongTroRrepositoryImpl();
    @Override
    public List<PhongTro> findAll() {
        return phongTroRrepository.findAll();
    }

    @Override
    public void create(PhongTro user) {
        phongTroRrepository.create(user);
    }

    @Override
    public void update(int id, PhongTro user) {
        phongTroRrepository.update(id, user);
    }

    @Override
    public void delete(int id) {
        phongTroRrepository.delete(id);
    }

    @Override
    public List<PhongTro> findByName(String name) {
        return phongTroRrepository.findByName(name);
    }

    @Override
    public PhongTro findUserID(int id) {
        return phongTroRrepository.findUserID(id);
    }
}
