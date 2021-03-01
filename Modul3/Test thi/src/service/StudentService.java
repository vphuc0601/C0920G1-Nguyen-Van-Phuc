package service;

import model.Student;
import repository.BaseRepository;
import repository.BaseRepositoryImpl;
import repository.StudentRepository;

import java.sql.SQLException;
import java.util.List;

public class StudentService implements StudentServiceImpl {
    private BaseRepositoryImpl baseRepository =new StudentRepository();

    @Override
    public List<Student> findAllStudent() {
        return baseRepository.findAllStudent();
    }

    @Override
    public void createStudent(Student student) throws SQLException {
        baseRepository.createStudent(student);
    }

    @Override
    public void editStudent(Student student) throws SQLException {
        baseRepository.editStudent(student);
    }

    @Override
    public Student findStudentById(int student_id) {
        return baseRepository.findStudentById(student_id);
    }

    @Override
    public List<Student> searchStudentByName(String student_name) throws SQLException {
        return baseRepository.searchStudentByName(student_name);
    }

    @Override
    public void deleteStudentByName(String student_name) {
        baseRepository.deleteStudentByName(student_name);
    }
}
