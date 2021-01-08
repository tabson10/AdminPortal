package com.example.adminportal.service;

import com.example.adminportal.domain.Batch;

import java.util.List;
import java.util.Set;

public interface BatchService {

    Batch save(Batch batch);

    List<Batch> findAll();
}
