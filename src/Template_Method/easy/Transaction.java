package Template_Method.easy;

// Абстрактный класс: Шаблонный метод
abstract class Transaction {
    // Шаблонный метод
    public final void executeTransaction(double amount) {
        validateAmount(amount);
        processTransaction(amount);
        logTransaction(amount);
    }

    protected abstract void processTransaction(double amount);

    private void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть положительной.");
        }
    }

    private void logTransaction(double amount) {
        System.out.println("Транзакция на сумму " + amount + " завершена.");
    }
}
