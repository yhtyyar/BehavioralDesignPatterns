package Command.easy;

// Конкретная команда: Отмена перевода
class UndoTransferCommand implements Command {
    private BankAccount sourceAccount;
    private BankAccount destinationAccount;
    private double amount;

    public UndoTransferCommand(BankAccount sourceAccount, BankAccount destinationAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        destinationAccount.withdraw(amount);
        sourceAccount.deposit(amount);
        System.out.println("Возврат " + amount + " из " + destinationAccount + " на " + sourceAccount);
    }
}
