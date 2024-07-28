package Visitor.medium;

class SavingsAccount implements Account {
    private double balance;

    public SavingsAccount(double balance) {
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
