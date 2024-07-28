package Iterator.medium;

// Интерфейс коллекции
interface AccountCollection {
    void addAccount(Account account);
    void removeAccount(Account account);
    AccountIterator iterator();
}
