//package Template_Method;
//
//public class EasyCode {
//}
//
//// Обработка различных типов банковских транзакций (например, депозит, снятие).
//
//// Абстрактный класс: Шаблонный метод
//abstract class Transaction {
//    // Шаблонный метод
//    public final void executeTransaction(double amount) {
//        validateAmount(amount);
//        processTransaction(amount);
//        logTransaction(amount);
//    }
//
//    protected abstract void processTransaction(double amount);
//
//    private void validateAmount(double amount) {
//        if (amount <= 0) {
//            throw new IllegalArgumentException("Сумма должна быть положительной.");
//        }
//    }
//
//    private void logTransaction(double amount) {
//        System.out.println("Транзакция на сумму " + amount + " завершена.");
//    }
//}
//
//// Конкретный класс: Депозит
//class DepositTransaction extends Transaction {
//    @Override
//    protected void processTransaction(double amount) {
//        System.out.println("Выполняется депозит: " + amount);
//        // Логика для добавления суммы на счёт
//    }
//}
//
//// Конкретный класс: Снятие
//class WithdrawalTransaction extends Transaction {
//    @Override
//    protected void processTransaction(double amount) {
//        System.out.println("Выполняется снятие: " + amount);
//        // Логика для списания суммы со счёта
//    }
//}
//
//// Клиент
//public class BankTemplateMethodExample {
//    public static void main(String[] args) {
//        Transaction deposit = new DepositTransaction();
//        deposit.executeTransaction(1000);
//        // Выполняется депозит: 1000
//        // Транзакция на сумму 1000 завершена.
//
//        Transaction withdrawal = new WithdrawalTransaction();
//        withdrawal.executeTransaction(500);
//        // Выполняется снятие: 500
//        // Транзакция на сумму 500 завершена.
//    }
//}
//
//
//// Паттерн "Шаблонный метод" в данном примере предоставляет четкую структуру для выполнения различных типов транзакций
//// в банке, инкапсулируя общую логику в абстрактном классе и позволяя конкретным реализациям определять детали.
//// Это улучшает читаемость и расширяемость кода, упрощая добавление новых типов транзакций в будущем.
//
