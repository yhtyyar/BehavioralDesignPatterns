package Strategy.easy;

// Контекст, использующий стратегию
class BankTransaction {
    private TransactionFeeStrategy feeStrategy;

    public BankTransaction(TransactionFeeStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }

    public void setFeeStrategy(TransactionFeeStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }

    public void executeTransaction(double amount) {
        double fee = feeStrategy.calculateFee(amount);
        System.out.println("Комиссия за транзакцию в размере " + amount + " составляет: " + fee);
    }
}
