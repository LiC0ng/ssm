package com.example.service;

import com.example.domain.Account;

import java.util.List;

public interface IAccountService {

    /**
     * Query all account information
     * @return The list of account information
     */
    public List<Account> findAll();

    /**
     * Save Account
     * @param account Account
     */
    public void saveAccount(Account account);

}
