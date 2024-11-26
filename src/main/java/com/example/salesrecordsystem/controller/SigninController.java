package com.example.salesrecordsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.salesrecordsystem.model.Groups;
import com.example.salesrecordsystem.service.SigninService;

@Controller
public class SigninController {

    @Autowired
    SigninService service;
    
    @GetMapping("/")
    public String getRoot(Model model) {
        // ログイン情報を格納するモデル
        model.addAttribute("group", new Groups());
        // signin.htmlに画面遷移
        return "user/signin";
    }

    @PostMapping("/signin")
    public String postSignin(@ModelAttribute Groups groups, Model model) {

        // 検索結果
        Groups result_group = new Groups();

        // 入力されたパスワードでテーブル検索
        result_group = service.searchOne(groups.getPassword());

        // 検索結果をhtmlに表示させるモデル
        model.addAttribute("group", result_group);

        // signin_result.htmlに遷移
        return "user/signin_result";
    }
}