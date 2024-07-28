package Visitor.easy;

// Конкретная реализация банковского счета: Сберегательный счет
class SavingsAccount implements Account {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
