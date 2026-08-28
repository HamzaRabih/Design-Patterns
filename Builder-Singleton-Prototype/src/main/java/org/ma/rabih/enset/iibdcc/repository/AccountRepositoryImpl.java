package org.ma.rabih.enset.iibdcc.repository;

import org.ma.rabih.enset.iibdcc.model.AccountStatus;
import org.ma.rabih.enset.iibdcc.model.AccountType;
import org.ma.rabih.enset.iibdcc.model.BankAcount;
import org.ma.rabih.enset.iibdcc.model.BankDirectot;

import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccountRepositoryImpl implements AccountRepository {
    private Map<Long, BankAcount> bankAcountMap = new HashMap<>();
    private long accountsCountId = 0;

    @Override
    public BankAcount save(BankAcount bankAcount) {
        Long accountId = this.accountsCountId++;
        bankAcount.setAccountId(accountId);
        bankAcountMap.put(accountId, bankAcount);
        return bankAcount;
    }

    @Override
    public List<BankAcount> findAll() {
        return bankAcountMap.values().stream().toList();
    }

    @Override
    public List<BankAcount> searchAccounts(Predicate<BankAcount> predicate) {
        return bankAcountMap.values().stream().filter(predicate).collect(Collectors.toList());
    }

    @Override
    public Optional<BankAcount> findById(Long id) {
        BankAcount acount = bankAcountMap.get(id);
        if (acount == null) {
            return Optional.empty();
        } else {
            return Optional.of(acount);
        }
    }

    @Override
    public BankAcount updateBankAcount(BankAcount bankAcount) {
        bankAcountMap.put(bankAcount.getAccountId(), bankAcount);
        return null;
    }

    @Override
    public void deleteById(Long id) {
        bankAcountMap.remove(id);
    }

    public void populateData(){
        for (int i = 0; i < 10; i++) {
            BankAcount bankAcount= BankDirectot.accountBuilder()
                    .balance(1000+Math.random()*9000)
                    .accountType(Math.random()>0.5?AccountType.CURRENT_ACCOUNT:AccountType.CURRENT_ACCOUNT)
                    .accountStatus(Math.random()>0.5?AccountStatus.CREATED:AccountStatus.ACTIVATED)
                    .currency(Math.random()>0.5?"MAD":"USD")
                    .build();
            save(bankAcount);

        }
    }
}
