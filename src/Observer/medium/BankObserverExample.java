package Observer.medium;

// Пример использования
public class BankObserverExample {
    public static void main(String[] args) {
        // Создаем счет
        Account account = new Account("123456789", 1000.0);

        // Создаем наблюдателей
        AccountObserver emailObserver = new EmailNotificationObserver("client@example.com");
        AccountObserver smsObserver = new SMSNotificationObserver("+1234567890");

        // Добавляем наблюдателей к счету
        account.addObserver(emailObserver);
        account.addObserver(smsObserver);

        // Выполняем операции над счетом
        account.deposit(500.0);
        account.withdraw(200.0);
    }
}
