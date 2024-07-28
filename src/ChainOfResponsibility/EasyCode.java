//package ChainOfResponsibility;
//
//public class EasyCode {
//}
//
//
//
//
//
//
//
//// Обработка различных банковских транзакций через систему с разными уровнями авторизации.
//
//// Абстрактный класс обработчика
//abstract class TransactionHandler {
//    protected TransactionHandler nextHandler;
//
//    public void setNextHandler(TransactionHandler nextHandler) {
//        this.nextHandler = nextHandler;
//    }
//
//    public abstract void handleRequest(double amount);
//}
//
//// Конкретный обработчик: Низкий уровень (Кассир)
//class CashierHandler extends TransactionHandler {
//    @Override
//    public void handleRequest(double amount) {
//        if (amount <= 1000) {
//            System.out.println("Транзакция обработана кассиром на сумму: " + amount);
//        } else if (nextHandler != null) {
//            nextHandler.handleRequest(amount);
//        }
//    }
//}
//
//// Конкретный обработчик: Средний уровень (Менеджер)
//class ManagerHandler extends TransactionHandler {
//    @Override
//    public void handleRequest(double amount) {
//        if (amount <= 5000) {
//            System.out.println("Транзакция обработана менеджером на сумму: " + amount);
//        } else if (nextHandler != null) {
//            nextHandler.handleRequest(amount);
//        }
//    }
//}
//
//// Конкретный обработчик: Высокий уровень (Директор)
//class DirectorHandler extends TransactionHandler {
//    @Override
//    public void handleRequest(double amount) {
//        if (amount > 5000) {
//            System.out.println("Транзакция обработана директором на сумму: " + amount);
//        } else if (nextHandler != null) {
//            nextHandler.handleRequest(amount);
//        }
//    }
//}
//
//// Клиент
//public class BankTransactionExample {
//    public static void main(String[] args) {
//        TransactionHandler cashier = new CashierHandler();
//        TransactionHandler manager = new ManagerHandler();
//        TransactionHandler director = new DirectorHandler();
//
//        cashier.setNextHandler(manager);
//        manager.setNextHandler(director);
//
//        double transactionAmount = 1000;
//        cashier.handleRequest(transactionAmount); // Вывод: Транзакция обработана кассиром на сумму: 1000
//
//        transactionAmount = 4500;
//        cashier.handleRequest(transactionAmount); // Вывод: Транзакция обработана менеджером на сумму: 4500
//
//        transactionAmount = 8000;
//        cashier.handleRequest(transactionAmount); // Вывод: Транзакция обработана директором на сумму: 8000
//    }
//}
