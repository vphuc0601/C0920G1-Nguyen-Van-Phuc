package Phuc;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserPhuc {
    public void insertUser(User user) throws SQLException;

    public List<User> selectUserByCountry(String country);

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;
}
