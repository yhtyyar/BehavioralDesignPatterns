package Iterator.medium;

import java.util.List;

// Конкретный итератор для списка счетов
class ListAccountIterator implements AccountIterator {
    private List<Account> accounts;
    private int index;

    public ListAccountIterator(List<Account> accounts) {
        this.accounts = accounts;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < accounts.size();
    }

    @Override
    public Account next() {
        if (hasNext()) {
            return accounts.get(index++);
        }
        return null;
    }
}
