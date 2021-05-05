package com.kodilla.accounts.domian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AccountDto {

    private Long id;
    private String nrb;
    private String currency;
    private Double availableFunds;
}
