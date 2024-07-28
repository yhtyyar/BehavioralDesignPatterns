//package Observer;
//
//public class EasyCode {
//}
//
//// Система уведомлений об изменении баланса банковского счёта для клиентов.
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//// Интерфейс Наблюдателя
//interface Observer {
//    void update(double balance);
//}
//
//// Интерфейс Издателя
//interface Subject {
//    void registerObserver(Observer observer);
//    void removeObserver(Observer observer);
//    void notifyObservers();
//}
//
//// Конкретный Издатель: Банковский счёт
//class BankAccount implements Subject {
//    private String accountNumber;
//    private double balance;
//    private List<Observer> observers;
//
//    public BankAccount(String accountNumber, double initialBalance) {
//        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
//        observers = new ArrayList<>();
//    }
//
//    public void deposit(double amount) {
//        balance += amount;
//        notifyObservers();
//    }
//
//    public void withdraw(double amount) {
//        balance -= amount;
//        notifyObservers();
//    }
//
//    @Override
//    public void registerObserver(Observer observer) {
//        observers.add(observer);
//    }
//
//    @Override
//    public void removeObserver(Observer observer) {
//        observers.remove(observer);
//    }
//
//    @Override
//    public void notifyObservers() {
//        for (Observer observer : observers) {
//            observer.update(balance);
//        }
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    @Override
//    public String toString() {
//        return "Счёт #" + accountNumber + " с балансом " + balance;
//    }
//}
//
//// Конкретный Наблюдатель: Клиент
//class Client implements Observer {
//    private String name;
//
//    public Client(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void update(double balance) {
//        System.out.println(name + " уведомлён о новом балансе: " + balance);
//    }
//}
//
//// Клиент
//public class BankObserverExample {
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount("123", 1000);
//        Client client1 = new Client("Клиент 1");
//        Client client2 = new Client("Клиент 2");
//
//        account.registerObserver(client1);
//        account.registerObserver(client2);
//
//        // Проведение операций и уведомление клиентов
//        account.deposit(250);
//        System.out.println(account); // Счёт #123 с балансом 1250
//
//        account.withdraw(150);
//        System.out.println(account); // Счёт #123 с балансом 1100
//    }
//}
//
//// Паттерн "Наблюдатель" позволяет системе автоматически уведомлять клиентов о изменении состояния баланса их
//// банковского счёта, не требуя от них пагубных зависимостей. Это улучшает модульность системы, делает её более
//// гибкой и удобной для расширения на будущее, обеспечивая четкое разделение обязанностей между объектами.
//
