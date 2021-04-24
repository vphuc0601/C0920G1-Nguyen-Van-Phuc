package com.example.case_study.services;

import com.example.case_study.entities.AttachService;

import java.util.List;

public interface AttachServiceService {
    List<AttachService> findAll();

    AttachService findById(Long id);

    void save(AttachService attachService);

    void remove(Long id);
}
