package ChainOfResponsibility.easy;

// Конкретный обработчик: Низкий уровень (Кассир)
class CashierHandler extends TransactionHandler {

    @Override
    public void handleRequest(double amount) {

        if (amount <= 1000) {
            System.out.println("Транзакция обработана кассиром на сумму: " + amount);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(amount);
        }
    }
}
