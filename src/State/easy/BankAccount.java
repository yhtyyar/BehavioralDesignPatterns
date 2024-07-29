package State.easy;

// Контекст: Банковский счёт
class BankAccount {
    private double balance;
    private AccountState state;

    public BankAccount() {
        this.balance = 0;
        this.state = new ActiveState(this);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposit(double amount) {
        state.deposit(amount);
    }

    public void withdraw(double amount) {
        state.withdraw(amount);
    }

    public void displayStatus() {
        state.displayStatus();
    }
}
