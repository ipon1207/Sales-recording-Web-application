package com.example.salesrecordsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.salesrecordsystem.model.User;
import com.example.salesrecordsystem.service.SignupService;

@Controller
public class SignupController {

    @Autowired
    SignupService service;
    
    @GetMapping("/")
    public String getRoot() {
        // signup.htmlへ画面遷移
        return "/user/signup";
    }

    @PostMapping("/signup")
    public String postSignup(@ModelAttribute User user, Model model) {
        // 入力値をデータベースに登録
        service.insert(user);

        return "signup_result";
    }
}
