package Observer.medium;

import java.util.ArrayList;
import java.util.List;

// Наблюдаемый объект - банковский счет
class Account implements AccountSubject {
    private String accountNumber;
    private double balance;
    private List<AccountObserver> observers;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(AccountObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(AccountObserver observer) {
        observers.remove(observer);
    }

    public void deposit(double amount) {
        balance += amount;
        notifyObservers();
    }

    public void withdraw(double amount) {
        balance -= amount;
        notifyObservers();
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void notifyObservers() {
        for (AccountObserver observer : observers) {
            observer.update(this);
        }
    }
}
