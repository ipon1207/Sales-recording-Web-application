package com.example.salesrecordsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.salesrecordsystem.model.Groups;
import com.example.salesrecordsystem.repository.ApplicationRepository;

@Service
public class SignupService {
    
    @Autowired
    ApplicationRepository repository;

    // データベースに値を登録
    public void insert(Groups group) {
        repository.save(group);
    }
}
