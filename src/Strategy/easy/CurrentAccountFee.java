package Strategy.easy;

// Конкретная стратегия: Комиссия для текущих счетов
class CurrentAccountFee implements TransactionFeeStrategy {
    @Override
    public double calculateFee(double amount) {
        return 0; // Без комиссии
    }
}
