package Template_Method.easy;

// Конкретный класс: Снятие
class WithdrawalTransaction extends Transaction {
    @Override
    protected void processTransaction(double amount) {
        System.out.println("Выполняется снятие: " + amount);
        // Логика для списания суммы со счёта
    }
}
