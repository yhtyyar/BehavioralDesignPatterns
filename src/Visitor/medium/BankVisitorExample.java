package Visitor.medium;

// Пример использования
public class BankVisitorExample {
    public static void main(String[] args) {

        Account checkingAccount = new CheckingAccount(1000.0);
        Account savingsAccount = new SavingsAccount(2000.0);

        AccountVisitor taxCalculator = new TaxCalculator();
        AccountVisitor reportGenerator = new ReportGenerator();

        checkingAccount.accept(taxCalculator);
        savingsAccount.accept(taxCalculator);

        checkingAccount.accept(reportGenerator);
        savingsAccount.accept(reportGenerator);
    }
}
