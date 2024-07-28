package Interpreter.easy;

// Клиент
public class BankInterpreterExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123", 1000);

        BankInterpreter interpreter = new BankInterpreter();

        Expression deposit = new DepositExpression(250);
        Expression withdraw = new WithdrawExpression(150);

        interpreter.setCommand(deposit);
        interpreter.interpret(account); // Добавлено 250 на счёт #123

        interpreter.setCommand(withdraw);
        interpreter.interpret(account); // Снято 150 со счёта #123
    }
}
