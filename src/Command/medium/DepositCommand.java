package Command.medium;

// Конкретная команда для пополнения счета
class DepositCommand implements Command {
    private Account account;
    private double amount;

    public DepositCommand(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
        System.out.println("Deposited " + amount + " to account " + account.getAccountNumber());
    }
}
