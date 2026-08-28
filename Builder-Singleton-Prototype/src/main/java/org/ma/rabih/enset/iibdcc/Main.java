package org.ma.rabih.enset.iibdcc;


import org.ma.rabih.enset.iibdcc.model.AccountStatus;
import org.ma.rabih.enset.iibdcc.model.AccountType;
import org.ma.rabih.enset.iibdcc.model.BankAcount;
import org.ma.rabih.enset.iibdcc.model.BankDirectot;
import org.ma.rabih.enset.iibdcc.repository.AccountRepository;
import org.ma.rabih.enset.iibdcc.repository.AccountRepositoryImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AccountRepositoryImpl accountRepository=new AccountRepositoryImpl();
        accountRepository.populateData();
        List<BankAcount> bankAcounts=accountRepository.findAll();
        bankAcounts.forEach(System.out::println);
    }
}