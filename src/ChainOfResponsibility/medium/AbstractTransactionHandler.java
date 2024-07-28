package ChainOfResponsibility.medium;

// Абстрактный класс обработчика
abstract class AbstractTransactionHandler implements TransactionHandler {

    protected TransactionHandler nextHandler;

    @Override
    public void setNext(TransactionHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void process(Transaction transaction) {
        if (nextHandler != null) {
            nextHandler.process(transaction);
        }
    }
}
