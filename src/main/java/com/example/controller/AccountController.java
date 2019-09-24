package com.example.controller;

import com.example.domain.Account;
import com.example.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Account Web Controller
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("view layer: find all account information");
        // 调用service的方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "list";
    }
}
