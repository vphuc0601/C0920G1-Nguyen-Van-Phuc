package com.example.case_study.repositories;

import com.example.case_study.entities.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division,Long> {
}
