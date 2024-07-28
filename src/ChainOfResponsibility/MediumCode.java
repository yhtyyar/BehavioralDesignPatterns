//package ChainOfResponsibility;
//
//public class MediumCode {
//}
//
//
//
//
//// В данном примере мы создадим цепочку обработчиков для проверки различных условий перед выполнением
//// банковской транзакции.
//
//
//// Интерфейс обработчика
//interface TransactionHandler {
//    void setNext(TransactionHandler handler);
//    void process(Transaction transaction);
//}
//
//// Абстрактный класс обработчика
//abstract class AbstractTransactionHandler implements TransactionHandler {
//    protected TransactionHandler nextHandler;
//
//    @Override
//    public void setNext(TransactionHandler handler) {
//        this.nextHandler = handler;
//    }
//
//    @Override
//    public void process(Transaction transaction) {
//        if (nextHandler != null) {
//            nextHandler.process(transaction);
//        }
//    }
//}
//
//// Конкретный обработчик для проверки баланса
//class BalanceCheckHandler extends AbstractTransactionHandler {
//    @Override
//    public void process(Transaction transaction) {
//        if (transaction.getAmount() <= transaction.getAccount().getBalance()) {
//            super.process(transaction);
//        } else {
//            System.out.println("Transaction failed: Insufficient balance.");
//        }
//    }
//}
//
//// Конкретный обработчик для проверки лимитов
//class LimitCheckHandler extends AbstractTransactionHandler {
//    private double dailyLimit = 1000.0;
//
//    @Override
//    public void process(Transaction transaction) {
//        if (transaction.getAmount() <= dailyLimit) {
//            super.process(transaction);
//        } else {
//            System.out.println("Transaction failed: Exceeds daily limit.");
//        }
//    }
//}
//
//// Конкретный обработчик для выполнения транзакции
//class ExecuteTransactionHandler extends AbstractTransactionHandler {
//    @Override
//    public void process(Transaction transaction) {
//        transaction.getAccount().withdraw(transaction.getAmount());
//        System.out.println("Transaction successful: " + transaction.getAmount() + " withdrawn.");
//    }
//}
//
//// Класс транзакции
//class Transaction {
//    private Account account;
//    private double amount;
//
//    public Transaction(Account account, double amount) {
//        this.account = account;
//        this.amount = amount;
//    }
//
//    public Account getAccount() {
//        return account;
//    }
//
//    public double getAmount() {
//        return amount;
//    }
//}
//
//// Класс счета
//class Account {
//    private String accountNumber;
//    private double balance;
//
//    public Account(String accountNumber, double balance) {
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
//
//    public void withdraw(double amount) {
//        if (balance >= amount) {
//            balance -= amount;
//        }
//    }
//}
//
//// Пример использования
//public class BankChainOfResponsibilityExample {
//    public static void main(String[] args) {
//        // Создаем обработчики
//        TransactionHandler balanceCheck = new BalanceCheckHandler();
//        TransactionHandler limitCheck = new LimitCheckHandler();
//        TransactionHandler executeTransaction = new ExecuteTransactionHandler();
//
//        // Устанавливаем цепочку обязанностей
//        balanceCheck.setNext(limitCheck);
//        limitCheck.setNext(executeTransaction);
//
//        // Создаем счет и транзакцию
//        Account account = new Account("123456789", 1500.0);
//        Transaction transaction = new Transaction(account, 500.0);
//
//        // Обрабатываем транзакцию
//        balanceCheck.process(transaction);
//    }
//}
//
//// В этом примере мы создали цепочку обработчиков для проверки баланса, лимитов и выполнения транзакции.
//// Каждый обработчик выполняет свою проверку и передает запрос дальше по цепочке, если необходимо.
//// Если какой-либо обработчик не может обработать запрос, он выводит сообщение об ошибке.
