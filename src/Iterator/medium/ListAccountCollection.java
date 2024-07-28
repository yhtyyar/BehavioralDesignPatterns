package Iterator.medium;

import java.util.ArrayList;
import java.util.List;

// Конкретная коллекция для списка счетов
class ListAccountCollection implements AccountCollection {
    private List<Account> accounts;

    public ListAccountCollection() {
        this.accounts = new ArrayList<>();
    }

    @Override
    public void addAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    @Override
    public AccountIterator iterator() {
        return new ListAccountIterator(accounts);
    }
}
