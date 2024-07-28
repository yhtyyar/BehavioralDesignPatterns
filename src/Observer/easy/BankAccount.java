package Observer.easy;

import java.util.ArrayList;
import java.util.List;

// Конкретный Издатель: Банковский счёт
class BankAccount implements Subject {
    private String accountNumber;
    private double balance;
    private List<Observer> observers;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        observers = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        notifyObservers();
    }

    public void withdraw(double amount) {
        balance -= amount;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Счёт #" + accountNumber + " с балансом " + balance;
    }
}
