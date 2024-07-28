package Memento.medium;

// Хранитель для сохранения состояния счета
class AccountMemento {
    private String accountNumber;
    private double balance;

    public AccountMemento(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
