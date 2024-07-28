package Iterator.easy;

// Интерфейс коллекции
interface AccountCollection {
    void addAccount(BankAccount account);
    Iterator<BankAccount> createIterator();
}