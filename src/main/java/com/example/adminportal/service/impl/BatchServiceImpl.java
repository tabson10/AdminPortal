package com.example.adminportal.service.impl;

import com.example.adminportal.domain.Batch;
import com.example.adminportal.repository.BatchRepository;
import com.example.adminportal.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BatchServiceImpl implements BatchService {

    @Autowired
    private BatchRepository batchRepository;

    public Batch save(Batch batch) {
        return batchRepository.save(batch);
    }

    @Override
    public List<Batch> findAll() {
        return (List<Batch>) batchRepository.findAll();
    }

    @Override
    public Optional<Batch> findById(int batchId) {
        return batchRepository.findById(batchId);
    }

}
