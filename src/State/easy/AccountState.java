package State.easy;

// Интерфейс состояния
interface AccountState {
    void deposit(double amount);
    void withdraw(double amount);
    void displayStatus();
}
