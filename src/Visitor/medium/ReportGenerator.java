package Visitor.medium;

class ReportGenerator implements AccountVisitor {
    @Override
    public void visit(CheckingAccount account) {
        System.out.println("Report for checking account: Balance = " + account.getBalance());
    }

    @Override
    public void visit(SavingsAccount account) {
        System.out.println("Report for savings account: Balance = " + account.getBalance());
    }
}
