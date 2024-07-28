package Mediator.medium;

// Интерфейс компонента
abstract class BankComponent {
    protected BankMediator mediator;

    public BankComponent(BankMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
