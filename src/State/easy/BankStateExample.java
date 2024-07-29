package State.easy;

// Клиент
public class BankStateExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.displayStatus(); // Счёт активен.

        account.deposit(1500); // Депозит: 1500. Баланс: 1500
        account.withdraw(400);  // Снятие: 400. Баланс: 1100

        // Перевод счета в заблокированное состояние
        account.setState(new BlockedState(account));
        account.displayStatus(); // Счёт заблокирован.

        account.deposit(500); // Счёт заблокирован. Депозиты невозможны.
        account.withdraw(200); // Счёт заблокирован. Снятия невозможны.
    }
}
