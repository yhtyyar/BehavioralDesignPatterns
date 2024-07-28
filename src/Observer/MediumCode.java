//package Observer;
//
//public class MediumCode {
//}
//
////В данном примере мы создадим наблюдаемый объект (субъект) для банковского счета и наблюдателей,
//// которые будут уведомляться о изменениях баланса.
//
//// Интерфейс наблюдателя
//interface AccountObserver {
//    void update(Account account);
//}
//
//// Конкретный наблюдатель - уведомление по email
//class EmailNotificationObserver implements AccountObserver {
//    private String email;
//
//    public EmailNotificationObserver(String email) {
//        this.email = email;
//    }
//
//    @Override
//    public void update(Account account) {
//        System.out.println("Sending email to " + email + ": Account balance changed to " + account.getBalance());
//    }
//}
//
//// Конкретный наблюдатель - уведомление по SMS
//class SMSNotificationObserver implements AccountObserver {
//    private String phoneNumber;
//
//    public SMSNotificationObserver(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    @Override
//    public void update(Account account) {
//        System.out.println("Sending SMS to " + phoneNumber + ": Account balance changed to " + account.getBalance());
//    }
//}
//
//// Наблюдаемый объект - банковский счет
//class Account {
//    private String accountNumber;
//    private double balance;
//    private List<AccountObserver> observers;
//
//    public Account(String accountNumber, double balance) {
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//        this.observers = new ArrayList<>();
//    }
//
//    public void addObserver(AccountObserver observer) {
//        observers.add(observer);
//    }
//
//    public void removeObserver(AccountObserver observer) {
//        observers.remove(observer);
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
//    public double getBalance() {
//        return balance;
//    }
//
//    private void notifyObservers() {
//        for (AccountObserver observer : observers) {
//            observer.update(this);
//        }
//    }
//}
//
//// Пример использования
//public class BankObserverExample {
//    public static void main(String[] args) {
//        // Создаем счет
//        Account account = new Account("123456789", 1000.0);
//
//        // Создаем наблюдателей
//        AccountObserver emailObserver = new EmailNotificationObserver("client@example.com");
//        AccountObserver smsObserver = new SMSNotificationObserver("+1234567890");
//
//        // Добавляем наблюдателей к счету
//        account.addObserver(emailObserver);
//        account.addObserver(smsObserver);
//
//        // Выполняем операции над счетом
//        account.deposit(500.0);
//        account.withdraw(200.0);
//    }
//}
//
//
////В этом примере мы создали наблюдаемый объект Account и наблюдателей EmailNotificationObserver и
//// SMSNotificationObserver. Наблюдатели реализуют интерфейс AccountObserver, который определяет метод update
//// для получения уведомлений о изменениях состояния.
////
////Класс Account содержит методы для добавления и удаления наблюдателей, а также методы для депозита и снятия
//// средств, которые уведомляют наблюдателей о изменениях баланса.
////
////В main методе мы создаем счет, добавляем наблюдателей и выполняем операции над счетом, что приводит к
//// уведомлению наблюдателей о изменениях баланса.
