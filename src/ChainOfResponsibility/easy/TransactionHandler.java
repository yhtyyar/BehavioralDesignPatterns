package ChainOfResponsibility.easy;

// Абстрактный класс обработчика
abstract class TransactionHandler {

    protected TransactionHandler nextHandler;

    public void setNextHandler(TransactionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(double amount);
}
