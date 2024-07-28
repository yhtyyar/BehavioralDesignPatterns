//package Command;
//
//public class MediumCode {
//}
//
//
//
//// В данном примере мы создадим команды для различных банковских операций,
//// таких как пополнение счета, снятие средств и проверка баланса.
//
//// Интерфейс команды
//interface Command {
//    void execute();
//}
//
//// Конкретная команда для пополнения счета
//class DepositCommand implements Command {
//    private Account account;
//    private double amount;
//
//    public DepositCommand(Account account, double amount) {
//        this.account = account;
//        this.amount = amount;
//    }
//
//    @Override
//    public void execute() {
//        account.deposit(amount);
//        System.out.println("Deposited " + amount + " to account " + account.getAccountNumber());
//    }
//}
//
//// Конкретная команда для снятия средств
//class WithdrawCommand implements Command {
//    private Account account;
//    private double amount;
//
//    public WithdrawCommand(Account account, double amount) {
//        this.account = account;
//        this.amount = amount;
//    }
//
//    @Override
//    public void execute() {
//        if (account.withdraw(amount)) {
//            System.out.println("Withdrawn " + amount + " from account " + account.getAccountNumber());
//        } else {
//            System.out.println("Insufficient funds in account " + account.getAccountNumber());
//        }
//    }
//}
//
//// Конкретная команда для проверки баланса
//class CheckBalanceCommand implements Command {
//    private Account account;
//
//    public CheckBalanceCommand(Account account) {
//        this.account = account;
//    }
//
//    @Override
//    public void execute() {
//        System.out.println("Balance for account " + account.getAccountNumber() + " is " + account.getBalance());
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
//    public void deposit(double amount) {
//        balance += amount;
//    }
//
//    public boolean withdraw(double amount) {
//        if (balance >= amount) {
//            balance -= amount;
//            return true;
//        }
//        return false;
//    }
//}
//
//// Класс, который будет вызывать команды
//class Bank {
//    public void executeCommand(Command command) {
//        command.execute();
//    }
//}
//
//// Пример использования
//public class BankCommandExample {
//    public static void main(String[] args) {
//        // Создаем счет
//        Account account = new Account("123456789", 1000.0);
//
//        // Создаем команды
//        Command depositCommand = new DepositCommand(account, 500.0);
//        Command withdrawCommand = new WithdrawCommand(account, 200.0);
//        Command checkBalanceCommand = new CheckBalanceCommand(account);
//
//        // Создаем банк и выполняем команды
//        Bank bank = new Bank();
//        bank.executeCommand(depositCommand);
//        bank.executeCommand(withdrawCommand);
//        bank.executeCommand(checkBalanceCommand);
//    }
//}
//
//// В этом примере мы создали команды для пополнения счета, снятия средств и проверки баланса. Каждая команда
//// инкапсулирует соответствующую операцию и может быть выполнена через метод execute.
//// Класс Bank вызывает команды, что позволяет легко добавлять новые команды и управлять ими.
