package Visitor.medium;

// Конкретные посетители
class TaxCalculator implements AccountVisitor {
    @Override
    public void visit(CheckingAccount account) {
        double tax = account.getBalance() * 0.01;
        System.out.println("Tax for checking account: " + tax);
    }

    @Override
    public void visit(SavingsAccount account) {
        double tax = account.getBalance() * 0.005;
        System.out.println("Tax for savings account: " + tax);
    }
}
