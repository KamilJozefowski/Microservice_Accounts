package com.kodilla.accounts.domian;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Entity(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "CUSTOMER_ID")
    @NotNull
    private Long customerId;

    @Column(name = "NRB")
    private String nrb;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "AVAILABLE_FUNDS")
    private Double availableFunds;

    public static class Builder {
        private Long id;
        private Long customerId;
        private String nrb;
        private String currency;
        private Double availableFunds;

        public Builder id(Long id){
            this.id = id;
            return this;
        }

        public Builder customerId(Long customerId){
            this.customerId = customerId;
            return this;
        }

        public Builder nrb(String nrb){
            this.nrb = nrb;
            return this;
        }

        public Builder currency(String currency){
            this.currency = currency;
            return this;
        }

        public Builder availableFunds(Double availableFunds){
            this.availableFunds = availableFunds;
            return this;
        }
    }
}
