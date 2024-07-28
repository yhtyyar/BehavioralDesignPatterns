package Memento.easy;

// Класс Хранитель (Memento)
class Memento {
    private final double balance;

    public Memento(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
