package repository;

import model.User;

import java.util.List;

public interface IUserRepository {
    List<User> findAll();
    void create(User user);
    void update(int id, User user);
    void delete(int id);
    List<User> findByName(String name);
    List<User> findByCountry(String country);
    User findUserByID(int id);
}
