package com.example.case_study.repositories;

import com.example.case_study.entities.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentTypeRepository extends JpaRepository<RentType,Long> {
}
