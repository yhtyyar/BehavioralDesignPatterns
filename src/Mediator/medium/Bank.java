package Mediator.medium;

class Bank extends BankComponent {
    public Bank(BankMediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Bank sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Bank receives: " + message);
    }
}
