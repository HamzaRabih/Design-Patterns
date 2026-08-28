package org.ma.rabih.enset.iibdcc.repository;

import org.ma.rabih.enset.iibdcc.model.BankAcount;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface AccountRepository {

    BankAcount save(BankAcount bankAcount);

    List<BankAcount> findAll();

    List<BankAcount> searchAccounts(Predicate<BankAcount> predicate);

    Optional<BankAcount> findById(Long id);

    BankAcount updateBankAcount(BankAcount bankAcount);

    void deleteById(Long id);
}
