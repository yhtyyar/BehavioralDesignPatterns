package ChainOfResponsibility.medium;

// Конкретный обработчик для проверки баланса
class BalanceCheckHandler extends AbstractTransactionHandler {

    @Override
    public void process(Transaction transaction) {
        if (transaction.getAmount() <= transaction.getAccount().getBalance()) {
            super.process(transaction);
        } else {
            System.out.println("Transaction failed: Insufficient balance.");
        }
    }
}
