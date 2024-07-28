package Observer.easy;

// Клиент
public class BankObserverExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123", 1000);
        Client client1 = new Client("Клиент 1");
        Client client2 = new Client("Клиент 2");

        account.registerObserver(client1);
        account.registerObserver(client2);

        // Проведение операций и уведомление клиентов
        account.deposit(250);
        System.out.println(account); // Счёт #123 с балансом 1250

        account.withdraw(150);
        System.out.println(account); // Счёт #123 с балансом 1100
    }
}
