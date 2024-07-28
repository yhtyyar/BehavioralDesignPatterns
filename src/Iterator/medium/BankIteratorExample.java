package Iterator.medium;

// Пример использования
public class BankIteratorExample {
    public static void main(String[] args) {
        // Создаем коллекцию счетов
        AccountCollection accountCollection = new ListAccountCollection();

        // Добавляем счета в коллекцию
        accountCollection.addAccount(new Account("123456789", 1000.0));
        accountCollection.addAccount(new Account("987654321", 2000.0));
        accountCollection.addAccount(new Account("112233445", 1500.0));

        // Получаем итератор и перебираем счета
        AccountIterator iterator = accountCollection.iterator();
        while (iterator.hasNext()) {
            Account account = iterator.next();
            System.out.println(account);
        }
    }
}
