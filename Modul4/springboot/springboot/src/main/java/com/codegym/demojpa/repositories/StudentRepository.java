package com.codegym.demojpa.repositories;

import com.codegym.demojpa.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByNameContaining(String name);

    @Query("select * from Student where id = 1 and name like '%trung'")
    List<Student> searchAbc();
}
