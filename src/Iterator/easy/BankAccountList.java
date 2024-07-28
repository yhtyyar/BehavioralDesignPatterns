package Iterator.easy;

import java.util.ArrayList;
import java.util.List;

// Конкретная коллекция: Список счетов
class BankAccountList implements AccountCollection {
    private List<BankAccount> accounts;

    public BankAccountList() {
        accounts = new ArrayList<>();
    }

    @Override
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    @Override
    public Iterator<BankAccount> createIterator() {
        return new BankAccountIterator(accounts);
    }
}
