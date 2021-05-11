package com.kodilla.accounts.repository;

import com.kodilla.accounts.domian.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    @Override
    Optional<Account> findById(Long id);

    List<Account> findAllByCustomerId(Long customerId);
}
