package Visitor.easy;

// Конкретная реализация банковского счета: Текущий счет
class CurrentAccount implements Account {
    private double balance;

    public CurrentAccount(double balance) {
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
