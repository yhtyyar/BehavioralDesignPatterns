package Mediator.easy;

import java.util.ArrayList;
import java.util.List;

// Конкретный посредник
class BankMediator implements Mediator {
    private List<BankAccount> accounts;

    public BankMediator() {
        accounts = new ArrayList<>();
    }

    @Override
    public void registerAccount(BankAccount account) {
        accounts.add(account);
    }

    @Override
    public void displayAccounts() {
        System.out.println("Список банковских счетов:");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }
}

