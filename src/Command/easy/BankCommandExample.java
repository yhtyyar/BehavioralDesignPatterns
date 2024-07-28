package Command.easy;

// Клиент
public class BankCommandExample {
    public static void main(String[] args) {
        BankAccount accountA = new BankAccount("123", 1000);
        BankAccount accountB = new BankAccount("456", 500);

        Command transfer = new TransferFundsCommand(accountA, accountB, 200);
        Command undoTransfer = new UndoTransferCommand(accountA, accountB, 200);

        CommandInvoker invoker = new CommandInvoker();

        invoker.setCommand(transfer);
        invoker.executeCommand(); // Переведено 200 из Счёт #123 с балансом 800.0 в Счёт #456 с балансом 700.0

        invoker.setCommand(undoTransfer);
        invoker.executeCommand(); // Возврат 200 из Счёт #456 с балансом 500.0 на Счёт #123 с балансом 1000.0
    }
}
