package ChainOfResponsibility.easy;

// Конкретный обработчик: Высокий уровень (Директор)
class DirectorHandler extends TransactionHandler {

    @Override
    public void handleRequest(double amount) {
        if (amount > 5000) {
            System.out.println("Транзакция обработана директором на сумму: " + amount);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(amount);
        }
    }
}
