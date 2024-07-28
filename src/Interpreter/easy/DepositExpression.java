package Interpreter.easy;

// Конкретное выражение: Депозит
class DepositExpression implements Expression {
    private double amount;

    public DepositExpression(double amount) {
        this.amount = amount;
    }

    @Override
    public void interpret(BankAccount context) {
        context.deposit(amount);
        System.out.println("Добавлено " + amount + " на счёт #" + context.getAccountNumber());
    }
}
