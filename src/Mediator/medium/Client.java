package Mediator.medium;

// Конкретный компонент - клиент
class Client extends BankComponent {
    private String name;

    public Client(BankMediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " receives: " + message);
    }
}
