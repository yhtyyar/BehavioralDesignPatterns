//package Interpreter;
//
//public class EasyCode {
//}
//
//
//
//
////В банковской сфере паттерн "Интерпретатор" может быть использован для создания интерпретатора команд,
//// выполняющих операции на счетах, такие как "депозит" и "вывод".
//
//
//// Интерфейс выражения
//interface Expression {
//    void interpret(BankAccount context);
//}
//
//// Конкретное выражение: Депозит
//class DepositExpression implements Expression {
//    private double amount;
//
//    public DepositExpression(double amount) {
//        this.amount = amount;
//    }
//
//    @Override
//    public void interpret(BankAccount context) {
//        context.deposit(amount);
//        System.out.println("Добавлено " + amount + " на счёт #" + context.getAccountNumber());
//    }
//}
//
//// Конкретное выражение: Вывод
//class WithdrawExpression implements Expression {
//    private double amount;
//
//    public WithdrawExpression(double amount) {
//        this.amount = amount;
//    }
//
//    @Override
//    public void interpret(BankAccount context) {
//        context.withdraw(amount);
//        System.out.println("Снято " + amount + " со счёта #" + context.getAccountNumber());
//    }
//}
//
//// Класс для банковского счёта
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
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    @Override
//    public String toString() {
//        return "Счёт #" + accountNumber + " с балансом " + balance;
//    }
//}
//
//// Класс интерпретатора
//class BankInterpreter {
//    private Expression command;
//
//    public void setCommand(Expression command) {
//        this.command = command;
//    }
//
//    public void interpret(BankAccount context) {
//        command.interpret(context);
//    }
//}
//
//// Клиент
//public class BankInterpreterExample {
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount("123", 1000);
//
//        BankInterpreter interpreter = new BankInterpreter();
//
//        Expression deposit = new DepositExpression(250);
//        Expression withdraw = new WithdrawExpression(150);
//
//        interpreter.setCommand(deposit);
//        interpreter.interpret(account); // Добавлено 250 на счёт #123
//
//        interpreter.setCommand(withdraw);
//        interpreter.interpret(account); // Снято 150 со счёта #123
//    }
//}
//
//// Паттерн "Интерпретатор" позволяет создать расширяемую систему для обработки запросов в банковских операциях.
//// Он упрощает реализацию команд и позволяет легко добавлять новые операции, следуя грамматике,
//// что делает код более чистым и структурированным.
//
