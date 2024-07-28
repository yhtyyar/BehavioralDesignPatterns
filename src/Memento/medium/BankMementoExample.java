package Memento.medium;

// Пример использования
public class BankMementoExample {
    public static void main(String[] args) {
        // Создаем счет
        Account account = new Account("123456789", 1000.0);
        System.out.println("Initial state: " + account);

        // Создаем опекуна и сохраняем текущее состояние счета
        AccountCareTaker careTaker = new AccountCareTaker();
        careTaker.saveMemento(account.save());

        // Выполняем операции над счетом
        account.deposit(500.0);
        System.out.println("After deposit: " + account);

        account.withdraw(200.0);
        System.out.println("After withdrawal: " + account);

        // Восстанавливаем предыдущее состояние счета
        account.restore(careTaker.retrieveMemento());
        System.out.println("Restored state: " + account);
    }
}
