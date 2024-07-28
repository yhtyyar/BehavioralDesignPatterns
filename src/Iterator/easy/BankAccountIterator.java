package Iterator.easy;

import java.util.List;

// Конкретный итератор
class BankAccountIterator implements Iterator<BankAccount> {
    private List<BankAccount> accounts;
    private int position;

    public BankAccountIterator(List<BankAccount> accounts) {
        this.accounts = accounts;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < accounts.size();
    }

    @Override
    public BankAccount next() {
        return accounts.get(position++);
    }
}
