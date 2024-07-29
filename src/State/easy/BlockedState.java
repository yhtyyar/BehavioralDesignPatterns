package State.easy;

// Конкретное состояние: Заблокированный счёт
class BlockedState implements AccountState {
    private BankAccount account;

    public BlockedState(BankAccount account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Счёт заблокирован. Депозиты невозможны.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Счёт заблокирован. Снятия невозможны.");
    }

    @Override
    public void displayStatus() {
        System.out.println("Счёт заблокирован.");
    }
}
