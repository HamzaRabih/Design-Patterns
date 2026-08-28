package ma.rabih.iibdcc.repository;

import ma.rabih.iibdcc.model.AccountStatus;
import ma.rabih.iibdcc.model.AccountType;
import ma.rabih.iibdcc.model.BankAccount;
import ma.rabih.iibdcc.model.BankDirector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccountRepositoryImp implements AccountRepository {
    private Map<Long, BankAccount> bankAccountMap = new HashMap<>();
    private long accountCount = 0;
    @Override
    public BankAccount save(BankAccount bankAccount) {
        long accountId = ++accountCount;
        bankAccount.setAccountId(accountId);
        bankAccountMap.put(accountId, bankAccount);
        return bankAccount;
    }

    @Override
    public List<BankAccount> findAll() {
        return bankAccountMap.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(Long accountId) {
        BankAccount bankAccount = bankAccountMap.get(accountId);
        if (bankAccount == null) {
            return Optional.empty();
        }else {
            return Optional.of(bankAccount);
        }
    }

    @Override
    public List<BankAccount> searchAccounts(Predicate<BankAccount> predicate) {
        return bankAccountMap.values().stream().filter(predicate).collect(Collectors.toList());
    }

    @Override
    public BankAccount update(BankAccount account) {
        bankAccountMap.put(account.getAccountId(), account);
        return null;
    }

    @Override
    public void deleteById(Long accountId) {
        bankAccountMap.remove(accountId);
    }


    //Utilisation du paterne Builder : pour la construction d'un objets compliqués
    public void populaiteData(){
        for (int i = 0; i < 10; i++) {
            BankAccount bankAccount = BankDirector.accountBuilder()
                    .balance(10000+Math.random()*90000)
                    .accountType(Math.random()>0.5? AccountType.SAVING_ACCOUNT : AccountType.CURRENT_ACCOUNT)
                    .accountStatus(Math.random()>0.5? AccountStatus.CREATED : AccountStatus.ACTIVATED)
                    .currency(Math.random()>0.5? "MAD" : "USD")
                    .build();
            this.save(bankAccount);



        }
    }
}
