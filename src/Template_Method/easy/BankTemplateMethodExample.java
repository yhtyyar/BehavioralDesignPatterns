package Template_Method.easy;

// Клиент
public class BankTemplateMethodExample {
    public static void main(String[] args) {
        Transaction deposit = new DepositTransaction();
        deposit.executeTransaction(1000);
        // Выполняется депозит: 1000
        // Транзакция на сумму 1000 завершена.

        Transaction withdrawal = new WithdrawalTransaction();
        withdrawal.executeTransaction(500);
        // Выполняется снятие: 500
        // Транзакция на сумму 500 завершена.
    }
}
