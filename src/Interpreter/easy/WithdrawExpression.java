package Interpreter.easy;

// Конкретное выражение: Вывод
class WithdrawExpression implements Expression {
    private double amount;

    public WithdrawExpression(double amount) {
        this.amount = amount;
    }

    @Override
    public void interpret(BankAccount context) {
        context.withdraw(amount);
        System.out.println("Снято " + amount + " со счёта #" + context.getAccountNumber());
    }
}
