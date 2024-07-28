package Mediator.medium;

// Конкретный компонент - счет
class Account extends BankComponent {
    private String accountNumber;

    public Account(BankMediator mediator, String accountNumber) {
        super(mediator);
        this.accountNumber = accountNumber;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Account " + accountNumber + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Account " + accountNumber + " receives: " + message);
    }
}
