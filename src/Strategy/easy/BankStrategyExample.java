package Strategy.easy;

// Клиент
public class BankStrategyExample {
    public static void main(String[] args) {
        BankTransaction transaction1 = new BankTransaction(new SavingsAccountFee());
        transaction1.executeTransaction(1000); // Комиссия за транзакцию в размере 1000 составляет: 10.0

        BankTransaction transaction2 = new BankTransaction(new CurrentAccountFee());
        transaction2.executeTransaction(1000); // Комиссия за транзакцию в размере 1000 составляет: 0.0
    }
}
