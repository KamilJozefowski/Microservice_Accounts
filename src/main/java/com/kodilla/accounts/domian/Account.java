package com.kodilla.accounts.domian;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Entity(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NRB")
    private String nrb;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "AVAILABLE_FUNDS")
    private Double availableFunds;

}
