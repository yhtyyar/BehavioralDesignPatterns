package Strategy.easy;

// Конкретная стратегия: Комиссия для сберегательных счетов
class SavingsAccountFee implements TransactionFeeStrategy {
    @Override
    public double calculateFee(double amount) {
        return amount * 0.01; // 1% комиссия
    }
}
