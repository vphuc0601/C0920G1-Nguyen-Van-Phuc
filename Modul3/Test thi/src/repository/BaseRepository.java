package repository;

import model.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class BaseRepository  {
    private Connection connection;
    private final String url = "jdbc:mysql://localhost:3306/student_manager";
    private final String userName = "root";
    private final String password = "vanhung240518";

    public BaseRepository(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url,userName,password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return connection;
    }


}
