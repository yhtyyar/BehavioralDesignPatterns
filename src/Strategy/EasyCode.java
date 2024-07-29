//package Strategy;
//
//public class EasyCode {
//}
//
//
////  Вычисление комиссии за транзакции для различных типов банковских счетов.
//
//// Интерфейс стратегии
//interface TransactionFeeStrategy {
//    double calculateFee(double amount);
//}
//
//// Конкретная стратегия: Комиссия для сберегательных счетов
//class SavingsAccountFee implements TransactionFeeStrategy {
//    @Override
//    public double calculateFee(double amount) {
//        return amount * 0.01; // 1% комиссия
//    }
//}
//
//// Конкретная стратегия: Комиссия для текущих счетов
//class CurrentAccountFee implements TransactionFeeStrategy {
//    @Override
//    public double calculateFee(double amount) {
//        return 0; // Без комиссии
//    }
//}
//
//// Контекст, использующий стратегию
//class BankTransaction {
//    private TransactionFeeStrategy feeStrategy;
//
//    public BankTransaction(TransactionFeeStrategy feeStrategy) {
//        this.feeStrategy = feeStrategy;
//    }
//
//    public void setFeeStrategy(TransactionFeeStrategy feeStrategy) {
//        this.feeStrategy = feeStrategy;
//    }
//
//    public void executeTransaction(double amount) {
//        double fee = feeStrategy.calculateFee(amount);
//        System.out.println("Комиссия за транзакцию в размере " + amount + " составляет: " + fee);
//    }
//}
//
//// Клиент
//public class BankStrategyExample {
//    public static void main(String[] args) {
//        BankTransaction transaction1 = new BankTransaction(new SavingsAccountFee());
//        transaction1.executeTransaction(1000); // Комиссия за транзакцию в размере 1000 составляет: 10.0
//
//        BankTransaction transaction2 = new BankTransaction(new CurrentAccountFee());
//        transaction2.executeTransaction(1000); // Комиссия за транзакцию в размере 1000 составляет: 0.0
//    }
//}
//
////Паттерн "Стратегия" в данном примере предоставляет возможность динамически изменять алгоритмы расчета комиссии за
//// транзакции для разных типов банковских счетов. Такой подход упрощает управление и расширение функциональности
//// системы, обеспечивая более гибкое и чистое решение, что критично для сложных банковских приложений.
