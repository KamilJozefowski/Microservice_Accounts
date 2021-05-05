package com.kodilla.accounts.service;

import com.kodilla.accounts.domian.Account;
import com.kodilla.accounts.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbService {
    private final AccountRepository accountRepository;

    public Optional<Account> getAccount(final Long taskId){
        return accountRepository.findById(taskId);
    }
}
