package com.example.salesrecordsystem.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Integer groupId;
    
    @Column(name = "group_name")
    private String groupName;

    @Column(name = "mail")
    private String mail;

    @Column(name = "password")
    private String password;
    
    @Column(name = "created_at")
    private Date createdAt;
}
