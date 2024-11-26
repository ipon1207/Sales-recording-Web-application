package com.example.salesrecordsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.salesrecordsystem.model.Groups;
import com.example.salesrecordsystem.repository.SigninRepository;

@Service
public class SigninService {
    
    @Autowired
    SigninRepository repository;

    public Groups searchOne(String password) throws UsernameNotFoundException {
        
        // Groupテーブルにpasswordで検索
        Groups group = repository.findByPassword(password);
        
        // 検索に失敗した場合
        if(group == null) {
            throw new UsernameNotFoundException("検索に失敗しました");
        }

        return group;
    }
}
