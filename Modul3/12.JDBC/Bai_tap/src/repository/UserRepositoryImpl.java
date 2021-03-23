package repository;

import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements IUserRepository {

    public static final String SELECT_ALL_USER = "select * from user";
    public static final String CREATE_NEW_USER = "insert into user( `name` , email, country) values (? ,? , ?)";
    public static final String SELECT_USER_BY_ID = "select id,`name`,email,country from user where id =?";
    private static final String UPDATE_USER_SQL = "update user set name = ?,email= ?, country =? where id = ?;";
    private static final String DELETE_USER_SQL= "delete from user where id=?;";
    private static final String FIND_USER_BY_NAME_SQL= "select id,`name`,email,country from user where `name` LIKE ? ";
    private static final String FIND_USER_BY_COUNTRY_SQL = " select id,`name`, email, country from user where country LIKE ?";

    @Override
    public List<User> findAll() {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet rs=null;
        List<User> userList= new ArrayList<>();

        if(connection!=null){
            try {
                preparedStatement=connection.prepareStatement(SELECT_ALL_USER);
                rs=preparedStatement.executeQuery();
                User user=null;
                while(rs.next()){
                    int id=rs.getInt(1);
                    String  name=rs.getString(2);
                    String email=rs.getString(3);
                    String country=rs.getString(4);
                    user= new User(id, name, email, country);
                    userList.add(user);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    rs.close();
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return userList;
    }

    @Override
    public void create(User user) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;

        if(connection!=null){
            try {
                preparedStatement=connection.prepareStatement(CREATE_NEW_USER);
                preparedStatement.setString(1,user.getName());
                preparedStatement.setString(2,user.getEmail());
                preparedStatement.setString(3,user.getCountry());
                preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        DBConnection.close();
    }

    @Override
    public void update(int id, User user) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement(UPDATE_USER_SQL);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,user.getCountry());
            preparedStatement.setInt(4,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement(DELETE_USER_SQL);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DBConnection.close();
    }

    @Override
    public List<User> findByName(String name) {
        List<User> userList = new ArrayList<>();
        User user;
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_USER_BY_NAME_SQL);) {
            String param = "%"+ name + "%";
            preparedStatement.setString(1, param);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id=rs.getInt("id");
                String name1=rs.getString("name");
                String email = rs.getString("email");
                String country=rs.getString("country");
                user = new User(id, name1, email, country);
                userList.add(user);
            }
        } catch (SQLException e) {

        }
        return userList;
    }

    @Override
    public List<User> findByCountry(String country) {
        List<User> userList=new ArrayList<>();
        User user;
        Connection connection=DBConnection.getConnection();
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(FIND_USER_BY_COUNTRY_SQL);
            preparedStatement.setString(1,"%"+ country +"%" );
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String email=rs.getString("email");
                user=new User(id,name,email,country);
                userList.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public User findUserByID(int id) {
        User user = null;
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                user = new User(id, name, email, country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
