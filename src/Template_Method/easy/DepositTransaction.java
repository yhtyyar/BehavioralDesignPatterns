package Template_Method.easy;

// Конкретный класс: Депозит
class DepositTransaction extends Transaction {
    @Override
    protected void processTransaction(double amount) {
        System.out.println("Выполняется депозит: " + amount);
        // Логика для добавления суммы на счёт
    }
}
