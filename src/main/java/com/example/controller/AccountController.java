package com.example.controller;

import com.example.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Account Web Controller
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public String findAll() {
        System.out.println("view layer: find all account information");
        // 调用service的方法
        accountService.findAll();
        return "list";
    }
}
