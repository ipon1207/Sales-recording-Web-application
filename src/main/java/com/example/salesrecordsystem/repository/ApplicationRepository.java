package com.example.salesrecordsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.salesrecordsystem.model.Groups;

@Repository
public interface ApplicationRepository extends JpaRepository<Groups, Integer> {
    
}