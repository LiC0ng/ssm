package com.example.dao;

import com.example.domain.Account;

import java.util.List;

/**
 * Account DAO Interface
 */
public interface IAccountDao {

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
