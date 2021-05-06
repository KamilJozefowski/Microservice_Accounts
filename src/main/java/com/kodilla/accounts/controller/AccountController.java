package com.kodilla.accounts.controller;

import com.kodilla.accounts.domian.AccountDto;
import com.kodilla.accounts.mapper.AccountMapper;
import com.kodilla.accounts.service.DbService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RefreshScope
@Slf4j
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class AccountController {

    @Value("${application.allow-get-accounts}")
    private boolean allowGetAccounts;

    private final DbService dbService;
    private final AccountMapper accountMapper;

    @RequestMapping(method = RequestMethod.GET, value = "/account/{accountId}")
    public AccountDto getAccount(@PathVariable Long accountId) throws TaskNotFoundException {
        if(!allowGetAccounts){
            log.info("Getting accounts is disabled.");
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "Getting accounts is disabled.");
        }
        return accountMapper.mapToAccountDto(dbService.getAccount(accountId).orElseThrow(TaskNotFoundException::new));
    }
}
