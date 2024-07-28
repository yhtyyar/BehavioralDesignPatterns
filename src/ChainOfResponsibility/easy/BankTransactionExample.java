package ChainOfResponsibility.easy;

// Клиент
public class BankTransactionExample {

    public static void main(String[] args) {
        TransactionHandler cashier = new CashierHandler();
        TransactionHandler manager = new ManagerHandler();
        TransactionHandler director = new DirectorHandler();

        cashier.setNextHandler(manager);
        manager.setNextHandler(director);


        double transactionAmount = 1000;
        cashier.handleRequest(transactionAmount); // Вывод: Транзакция обработана кассиром на сумму: 1000

        transactionAmount = 4500;
        cashier.handleRequest(transactionAmount); // Вывод: Транзакция обработана менеджером на сумму: 4500

        transactionAmount = 8000;
        cashier.handleRequest(transactionAmount); // Вывод: Транзакция обработана директором на сумму: 8000
    }
}
