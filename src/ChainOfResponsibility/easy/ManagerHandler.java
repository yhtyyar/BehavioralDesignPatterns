package ChainOfResponsibility.easy;

// Конкретный обработчик: Средний уровень (Менеджер)
class ManagerHandler extends TransactionHandler {

    @Override
    public void handleRequest(double amount) {

        if (amount <= 5000) {
            System.out.println("Транзакция обработана менеджером на сумму: " + amount);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(amount);
        }
    }
}
