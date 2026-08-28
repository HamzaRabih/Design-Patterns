package ma.rabih.iibdcc;

import ma.rabih.iibdcc.Util.JsonSerializer;
import ma.rabih.iibdcc.model.AccountStatus;
import ma.rabih.iibdcc.model.AccountType;
import ma.rabih.iibdcc.model.BankAccount;
import ma.rabih.iibdcc.model.BankDirector;
import ma.rabih.iibdcc.repository.AccountRepositoryImp;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        JsonSerializer<BankAccount> bankAccountJsonSerializer=new JsonSerializer<>();
        AccountRepositoryImp accountRepository = new AccountRepositoryImp();
        accountRepository.populaiteData();
        List<BankAccount> accounts=accountRepository.findAll();
       accounts.stream()
               .map(acc->bankAccountJsonSerializer.toJson(acc))
               .forEach(System.out::println);

        System.out.println("=========================");
        BankAccount account=accountRepository.findById(1L).orElse(null);
        if (account != null) {
            System.out.println(bankAccountJsonSerializer.toJson(account));
        }
    }
}