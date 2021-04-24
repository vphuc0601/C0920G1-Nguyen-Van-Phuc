package com.example.case_study.services;

import com.example.case_study.entities.CustomerType;
import com.example.case_study.entities.Position;

import java.util.List;

public interface PositionService {
    List<Position> findAll();

    Position findById(Long id);

    void save(Position position);

    void remove(Long id);
}
