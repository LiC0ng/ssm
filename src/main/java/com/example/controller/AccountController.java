package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Account Web Controller
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @RequestMapping("/findAll")
    public String findAll() {
        System.out.println("view layer: find all account information");
        return "list";
    }
}
