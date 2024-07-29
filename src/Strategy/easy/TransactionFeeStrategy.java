package Strategy.easy;

// Интерфейс стратегии
interface TransactionFeeStrategy {
    double calculateFee(double amount);
}
