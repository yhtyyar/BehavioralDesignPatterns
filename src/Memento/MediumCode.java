//package Memento;
//
//public class MediumCode {
//}
//
////В данном примере мы создадим хранителя для сохранения и восстановления состояния банковского счета.
//
//
//// Класс, состояние которого нужно сохранять
//class Account {
//    private String accountNumber;
//    private double balance;
//
//    public Account(String accountNumber, double balance) {
//        this.accountNumber = accountNumber;
//        this.balance = balance;
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
//    public AccountMemento save() {
//        return new AccountMemento(accountNumber, balance);
//    }
//
//    public void restore(AccountMemento memento) {
//        this.accountNumber = memento.getAccountNumber();
//        this.balance = memento.getBalance();
//    }
//
//    @Override
//    public String toString() {
//        return "Account{" +
//                "accountNumber='" + accountNumber + '\'' +
//                ", balance=" + balance +
//                '}';
//    }
//}
//
//// Хранитель для сохранения состояния счета
//class AccountMemento {
//    private String accountNumber;
//    private double balance;
//
//    public AccountMemento(String accountNumber, double balance) {
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//}
//
//// Опекун, который управляет сохранением и восстановлением состояния
//class AccountCareTaker {
//    private AccountMemento memento;
//
//    public void saveMemento(AccountMemento memento) {
//        this.memento = memento;
//    }
//
//    public AccountMemento retrieveMemento() {
//        return memento;
//    }
//}
//
//// Пример использования
//public class BankMementoExample {
//    public static void main(String[] args) {
//        // Создаем счет
//        Account account = new Account("123456789", 1000.0);
//        System.out.println("Initial state: " + account);
//
//        // Создаем опекуна и сохраняем текущее состояние счета
//        AccountCareTaker careTaker = new AccountCareTaker();
//        careTaker.saveMemento(account.save());
//
//        // Выполняем операции над счетом
//        account.deposit(500.0);
//        System.out.println("After deposit: " + account);
//
//        account.withdraw(200.0);
//        System.out.println("After withdrawal: " + account);
//
//        // Восстанавливаем предыдущее состояние счета
//        account.restore(careTaker.retrieveMemento());
//        System.out.println("Restored state: " + account);
//    }
//}
//
//// В этом примере мы создали хранителя для сохранения и восстановления состояния банковского счета.
//// Класс Account содержит методы для депозита и снятия средств, а также методы для сохранения и восстановления
//// состояния с помощью AccountMemento.
////
////Класс AccountMemento инкапсулирует состояние счета, сохраняя номер счета и баланс.
////
////Класс AccountCareTaker управляет сохранением и восстановлением состояния с помощью AccountMemento.
////
////В main методе мы создаем счет, сохраняем его начальное состояние, выполняем операции над счетом,
//// а затем восстанавливаем предыдущее состояние.
