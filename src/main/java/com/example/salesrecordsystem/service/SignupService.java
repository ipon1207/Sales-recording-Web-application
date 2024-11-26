package com.example.salesrecordsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.salesrecordsystem.model.User;
import com.example.salesrecordsystem.repository.SignupRepository;

@Repository
public class SignupService {
    
    @Autowired
    SignupRepository repository;

    // データベースに値を登録
    public void insert(User user) {
        repository.save(user);
    }
}
