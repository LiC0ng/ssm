package com.example.service.impl;

import com.example.domain.Account;
import com.example.service.IAccountService;

import java.util.List;

public class AccountServiceImpl implements IAccountService {
    @Override
    public List<Account> findAll() {
        System.out.println("service layer: find all account");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("service layer: save account");
    }
}
