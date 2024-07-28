package Memento.easy;

// Класс, для хранения состояния (Originator)
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public Memento save() {
        return new Memento(balance);
    }

    public void restore(Memento memento) {
        this.balance = memento.getBalance();
    }

    @Override
    public String toString() {
        return "Счёт #" + accountNumber + " с балансом " + balance;
    }
}
