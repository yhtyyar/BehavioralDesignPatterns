package ChainOfResponsibility.medium;

// Конкретный обработчик для выполнения транзакции
class ExecuteTransactionHandler extends AbstractTransactionHandler {
    @Override
    public void process(Transaction transaction) {
        transaction.getAccount().withdraw(transaction.getAmount());
        System.out.println("Transaction successful: " + transaction.getAmount() + " withdrawn.");
    }
}
