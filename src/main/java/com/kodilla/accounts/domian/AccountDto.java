package com.kodilla.accounts.domian;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {

    private Long id;
    private Long customerId;
    private String nrb;
    private String currency;
    private Double availableFunds;
}
