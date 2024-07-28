package Command.medium;

// Конкретная команда для снятия средств
class WithdrawCommand implements Command {
    private Account account;
    private double amount;

    public WithdrawCommand(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        if (account.withdraw(amount)) {
            System.out.println("Withdrawn " + amount + " from account " + account.getAccountNumber());
        } else {
            System.out.println("Insufficient funds in account " + account.getAccountNumber());
        }
    }
}
