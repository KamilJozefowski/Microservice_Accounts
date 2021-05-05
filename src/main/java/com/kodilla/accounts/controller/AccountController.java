package com.kodilla.accounts.controller;

import com.kodilla.accounts.domian.AccountDto;
import com.kodilla.accounts.mapper.AccountMapper;
import com.kodilla.accounts.service.DbService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class AccountController {

    private final DbService dbService;
    private final AccountMapper accountMapper;

    @RequestMapping(method = RequestMethod.GET, value = "/account/{accountId}")
    public AccountDto getTask(@PathVariable Long accountId) throws TaskNotFoundException {
        return accountMapper.mapToAccountDto(dbService.getAccount(accountId).orElseThrow(TaskNotFoundException::new));
    }
}
