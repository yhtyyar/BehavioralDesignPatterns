package Visitor.easy;

// Клиент
public class BankVisitorExample {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount(2000);
        Account currentAccount = new CurrentAccount(3000);

        Visitor taxCalculator = new TaxCalculator();

        savingsAccount.accept(taxCalculator); // Налог для Сберегательного счёта: 200.0
        currentAccount.accept(taxCalculator);  // Налог для Текущего счёта: 450.0
    }
}
