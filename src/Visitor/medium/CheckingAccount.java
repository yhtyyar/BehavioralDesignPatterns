package Visitor.medium;

// Конкретные элементы
class CheckingAccount implements Account {
    private double balance;

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void accept(AccountVisitor visitor) {
        visitor.visit(this);
    }
}
