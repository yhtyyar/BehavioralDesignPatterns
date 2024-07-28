package ChainOfResponsibility.medium;

public interface TransactionHandler {

    void setNext(TransactionHandler handler);
    void process(Transaction transaction);
}
