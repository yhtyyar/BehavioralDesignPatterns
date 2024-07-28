package Memento.easy;

// Клиент
public class BankMementoExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123", 1000);
        AccountCaretaker caretaker = new AccountCaretaker();

        // Сохранение первоначального состояния
        caretaker.addMemento(account.save());

        // Проведение операций
        account.deposit(250);
        System.out.println(account); // Счёт #123 с балансом 1250

        account.withdraw(150);
        System.out.println(account); // Счёт #123 с балансом 1100

        // Восстановление состояния
        account.restore(caretaker.getMemento(0));
        System.out.println("После восстановления: " + account); // Счёт #123 с балансом 1000
    }
}
