package repository;

import model.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements BaseRepositoryImpl {
    private BaseRepository baseRepository=new BaseRepository();
    String SQL_FIND_ALL_STUDENT="select*from student_manager;";
    String SQL_FIND_BY_ID="select* from student_manager where student_id=?;";
    String SQL_CREATE_STUDENT="insert into student_manager values(?,?,?,?,?,?);";
    String SQL_UPDATE_STUDENT="update student_manager set student_name=?, student_age=?," +
            "student_birthday=?,student_email=?,student_address=? where student_id=?;";
    String SQL_SEARCH_BY_NAME="selec* from student_manager where student_name= like ?;";
    @Override
    public List<Student> findAllStudent() {
       List<Student> studentList=new ArrayList<>();
        try {
            PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(SQL_FIND_ALL_STUDENT);
            ResultSet resultSet=preparedStatement.executeQuery();
            Student student;
            while (resultSet.next()){
                int student_id=resultSet.getInt("student_id");
                String student_name=resultSet.getString("student_name");
                int student_age=resultSet.getInt("student_age");
                String student_birthday=resultSet.getString("student_birthday");
                String student_email=resultSet.getString("student_email");
                String student_address=resultSet.getString("student_address");
                student=new Student(student_id,student_name,student_age,student_birthday,student_email,student_address);
                studentList.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    @Override
    public void createStudent(Student student) throws SQLException {
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(SQL_CREATE_STUDENT);
        preparedStatement.setInt(1, Integer.parseInt("student_id"));
        preparedStatement.setString(2,"student_name");
        preparedStatement.setInt(3, Integer.parseInt("student_age"));
        preparedStatement.setString(4,"student_birthday");
        preparedStatement.setString(5,"student_email");
        preparedStatement.setString(6,"student_address");
        preparedStatement.executeUpdate();
    }

    @Override
    public void editStudent(Student student) throws SQLException {
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(SQL_UPDATE_STUDENT);
        preparedStatement.setString(1, "student_name");
        preparedStatement.setInt(2, Integer.parseInt("student_age"));
        preparedStatement.setString(3,"student_birthday");
        preparedStatement.setString(4,"student_email");
        preparedStatement.setString(5,"student_address");
        preparedStatement.setInt(6, Integer.parseInt("student_id"));
        preparedStatement.executeUpdate();
    }

    @Override
    public Student  findStudentById(int student_id) {
        Student student=null;
        try {
            PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(SQL_FIND_BY_ID);
            preparedStatement.setInt(1,student_id);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                int student_id1=resultSet.getInt("student_id");
                String student_name=resultSet.getString("student_name");
                int student_age=resultSet.getInt("student_age");
                String student_birthday=resultSet.getString("student_birthday");
                String student_email=resultSet.getString("student_email");
                String student_address=resultSet.getString("student_address");
                student =new Student(student_id1,student_name,student_age,student_birthday,student_email,student_address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }return student;
    }

    @Override
    public List<Student> searchStudentByName(String student_name) throws SQLException {
        List<Student> studentList=new ArrayList<>();
        Student student=null;
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(SQL_SEARCH_BY_NAME);
        preparedStatement.setString(1,"student_name");
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            int student_id=resultSet.getInt("student_id");
            String student_name1=resultSet.getString("%"+student_name+"%");
            int student_age=resultSet.getInt("student_age");
            String student_birthday=resultSet.getString("student_birthday");
            String student_email=resultSet.getString("student_email");
            String student_address=resultSet.getString("student_address");
            student =new Student(student_id,student_name1,student_age,student_birthday,student_email,student_address);
            studentList.add(student);
        }

        return studentList;
    }

    @Override
    public void deleteStudentByName(String student_name) {

    }
}
