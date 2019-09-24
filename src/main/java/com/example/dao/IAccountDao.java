package com.example.dao;

import com.example.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Account DAO Interface
 */
public interface IAccountDao {

    /**
     * Query all account information
     * @return The list of account information
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * Save Account
     * @param account Account
     */
    @Insert("insert into account (name, money) values (#{name}, #{money})")
    public void saveAccount(Account account);

}
