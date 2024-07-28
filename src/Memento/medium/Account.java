package Memento.medium;

// Класс, состояние которого нужно сохранять
class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public AccountMemento save() {
        return new AccountMemento(accountNumber, balance);
    }

    public void restore(AccountMemento memento) {
        this.accountNumber = memento.getAccountNumber();
        this.balance = memento.getBalance();
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
