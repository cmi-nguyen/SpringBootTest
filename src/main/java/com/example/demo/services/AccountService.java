package com.example.demo.services;

import com.example.demo.entities.Account;

import java.util.List;


public interface AccountService {
    // Save operation
    Account saveAccount(Account account);

    // Read operation
    List<Account> fetchAccountList();

    // Update operation
    Account updateAccount(Account account, int accountID);

    // Delete operation

    void deleteAccountByID(int accountID);
}
