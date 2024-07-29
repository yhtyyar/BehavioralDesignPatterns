package State.easy;

// Конкретное состояние: Активный счёт
class ActiveState implements AccountState {
    private BankAccount account;

    public ActiveState(BankAccount account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Депозит: " + amount + ". Баланс: " + account.getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (amount > account.getBalance()) {
            System.out.println("Недостаточно средств для снятия: " + amount);
        } else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Снятие: " + amount + ". Баланс: " + account.getBalance());
        }
    }

    @Override
    public void displayStatus() {
        System.out.println("Счёт активен.");
    }
}
