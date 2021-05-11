package com.kodilla.accounts.mapper;

import com.kodilla.accounts.domian.Account;
import com.kodilla.accounts.domian.AccountDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountMapper {
    public Account mapToAccount(final AccountDto accountsDto) {
        return new Account(
                accountsDto.getId(),
                accountsDto.getCustomerId(),
                accountsDto.getNrb(),
                accountsDto.getCurrency(),
                accountsDto.getAvailableFunds());
    }

    public AccountDto mapToAccountDto(final Account account) {
        return new AccountDto(
                account.getId(),
                account.getCustomerId(),
                account.getNrb(),
                account.getCurrency(),
                account.getAvailableFunds());
    }

    public List<AccountDto> mapToListAccountDto(final List<Account> accountList) {
        return accountList.stream()
                .map(this::mapToAccountDto)
                .collect(Collectors.toList());
    }
}
