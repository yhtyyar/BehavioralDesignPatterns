//package Memento;
//
//public class EasyCode {
//}
//
//
////Система управления банковскими счетами с возможностью восстановления предыдущего состояния.
//
//// Класс Хранитель (Memento)
//class Memento {
//    private final double balance;
//
//    public Memento(double balance) {
//        this.balance = balance;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//}
//
//// Класс, для хранения состояния (Originator)
//class BankAccount {
//    private String accountNumber;
//    private double balance;
//
//    public BankAccount(String accountNumber, double initialBalance) {
//        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
//    }
//
//    public void deposit(double amount) {
//        balance += amount;
//    }
//
//    public void withdraw(double amount) {
//        balance -= amount;
//    }
//
//    public Memento save() {
//        return new Memento(balance);
//    }
//
//    public void restore(Memento memento) {
//        this.balance = memento.getBalance();
//    }
//
//    @Override
//    public String toString() {
//        return "Счёт #" + accountNumber + " с балансом " + balance;
//    }
//}
//
//// Класс Хранитель состояний (Caretaker)
//class AccountCaretaker {
//    private final List<Memento> mementoList = new ArrayList<>();
//
//    public void addMemento(Memento memento) {
//        mementoList.add(memento);
//    }
//
//    public Memento getMemento(int index) {
//        return mementoList.get(index);
//    }
//}
//
//// Клиент
//public class BankMementoExample {
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount("123", 1000);
//        AccountCaretaker caretaker = new AccountCaretaker();
//
//        // Сохранение первоначального состояния
//        caretaker.addMemento(account.save());
//
//        // Проведение операций
//        account.deposit(250);
//        System.out.println(account); // Счёт #123 с балансом 1250
//
//        account.withdraw(150);
//        System.out.println(account); // Счёт #123 с балансом 1100
//
//        // Восстановление состояния
//        account.restore(caretaker.getMemento(0));
//        System.out.println("После восстановления: " + account); // Счёт #123 с балансом 1000
//    }
//}
//
//
//// Паттерн "Хранитель" в данном примере позволяет сохранять и восстанавливать состояние банковского счёта,
//// не раскрывая внутреннюю структуру объекта. Это облегчает управление состоянием и делает систему более гибкой,
//// обеспечивая возможность отмены изменений и восстановления его состояния в любой момент времени.
