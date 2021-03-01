package service;

import model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentServiceImpl {
    public List<Student> findAllStudent();
    void createStudent(Student student) throws SQLException;
    void editStudent(Student student) throws SQLException;
    Student findStudentById(int student_id);
    public List<Student> searchStudentByName(String student_name) throws SQLException;
    void deleteStudentByName(String student_name);
}
