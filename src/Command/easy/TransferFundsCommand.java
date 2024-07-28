package Command.easy;

// Конкретная команда: Выполнение перевода средств
class TransferFundsCommand implements Command {
    private BankAccount sourceAccount;
    private BankAccount destinationAccount;
    private double amount;

    public TransferFundsCommand(BankAccount sourceAccount, BankAccount destinationAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        sourceAccount.withdraw(amount);
        destinationAccount.deposit(amount);
        System.out.println("Переведено " + amount + " из " + sourceAccount + " в " + destinationAccount);
    }
}
