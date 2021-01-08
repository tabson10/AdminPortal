package com.example.adminportal.service.impl;

import com.example.adminportal.domain.Batch;
import com.example.adminportal.repository.BatchRepository;
import com.example.adminportal.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BatchServiceImpl implements BatchService {

    @Autowired
    private BatchRepository batchRepository;

    public Batch save(Batch batch) {
        return batchRepository.save(batch);
    }

}
