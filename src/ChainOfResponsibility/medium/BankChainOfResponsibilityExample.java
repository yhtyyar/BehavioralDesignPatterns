package ChainOfResponsibility.medium;

// Пример использования
public class BankChainOfResponsibilityExample {
    public static void main(String[] args) {
        // Создаем обработчики
        TransactionHandler balanceCheck = new BalanceCheckHandler();
        TransactionHandler limitCheck = new LimitCheckHandler();
        TransactionHandler executeTransaction = new ExecuteTransactionHandler();

        // Устанавливаем цепочку обязанностей
        balanceCheck.setNext(limitCheck);
        limitCheck.setNext(executeTransaction);

        // Создаем счет и транзакцию
        Account account = new Account("123456789", 1500.0);
        Transaction transaction = new Transaction(account, 500.0);

        // Обрабатываем транзакцию
        balanceCheck.process(transaction);
    }
}
