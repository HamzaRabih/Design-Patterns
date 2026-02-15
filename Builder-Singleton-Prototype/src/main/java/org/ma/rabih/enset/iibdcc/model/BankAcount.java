package org.ma.rabih.enset.iibdcc.model;

public class BankAcount {
    private Long accountId;
    private double balance;
    private String currency;
    private AccountType type;
    private AccountStatus status;


    public BankAcount() {
    }

    public BankAcount(Long accountId, double balance, String currency, AccountType type, AccountStatus status) {
        this.accountId = accountId;
        this.balance = balance;
        this.currency = currency;
        this.type = type;
        this.status = status;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BankAcount{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", type=" + type +
                ", status=" + status +
                '}';
    }



    public static class AccountBuilder {
        private BankAcount bankAcount = new BankAcount();

        public AccountBuilder accountId(Long id) {
            bankAcount.accountId = id;
            return this;
        }

        public AccountBuilder balance(double balance) {
            bankAcount.balance = balance;
            return this;
        }

        public AccountBuilder currency(String currency) {
            bankAcount.currency = currency;
            return this;
        }

        public AccountBuilder accountType(AccountType accountType) {
            bankAcount.type = accountType;
            return this;
        }

        public AccountBuilder accountStatus(AccountStatus accountStatus) {
            bankAcount.status = accountStatus;
            return this;
        }

        public BankAcount build(){
            return this.bankAcount;
        }

    }
}
