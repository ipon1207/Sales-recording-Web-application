package com.example.salesrecordsystem.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.salesrecordsystem.model.Groups;
import com.example.salesrecordsystem.service.SignupService;

@Controller
public class SignupController {

    @Autowired
    SignupService service;
    
    @GetMapping("/")
    public String getRoot(Model model) {
        model.addAttribute("group", new Groups()); 
        // signup.htmlへ画面遷移
        return "user/signup";
    }

    @PostMapping("/signup")
    public String postSignup(@ModelAttribute Groups group, Model model) {
        // 現在時刻を設定
        group.setCreatedAt(LocalDateTime.now());
        // 入力値をデータベースに登録
        service.insert(group);

        model.addAttribute("group", group);

        return "user/signup_result";
    }
}
