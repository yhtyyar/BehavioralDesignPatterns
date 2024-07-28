package ChainOfResponsibility.medium;

// Конкретный обработчик для проверки лимитов
class LimitCheckHandler extends AbstractTransactionHandler {

    private double dailyLimit = 1000.0;

    @Override
    public void process(Transaction transaction) {
        if (transaction.getAmount() <= dailyLimit) {
            super.process(transaction);
        } else {
            System.out.println("Transaction failed: Exceeds daily limit.");
        }
    }
}
