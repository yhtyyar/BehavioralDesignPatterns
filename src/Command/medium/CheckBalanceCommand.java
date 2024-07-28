package Command.medium;

// Конкретная команда для проверки баланса
class CheckBalanceCommand implements Command {
    private Account account;

    public CheckBalanceCommand(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        System.out.println("Balance for account " + account.getAccountNumber() + " is " + account.getBalance());
    }
}
