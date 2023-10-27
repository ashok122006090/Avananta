package com.Avananta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Avananta.entity.YourEntity;
import com.Avananta.repository.YourEntityRepository;

@Service
public class YourEntityService {
    private final YourEntityRepository yourEntityRepository;

    @Autowired
    public YourEntityService(YourEntityRepository yourEntityRepository) {
        this.yourEntityRepository = yourEntityRepository;
    }

    public YourEntity findRecordByYourColumn(String yourParameter) {
        return yourEntityRepository.findRecordByYourColumn(yourParameter);
    }
}
