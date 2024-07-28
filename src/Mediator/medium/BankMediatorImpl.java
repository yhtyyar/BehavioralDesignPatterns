package Mediator.medium;

// Конкретный посредник
class BankMediatorImpl implements BankMediator {
    private Client client;
    private Account account;
    private Bank bank;

    public void setClient(Client client) {
        this.client = client;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void sendMessage(String message, BankComponent sender) {
        if (sender == client) {
            // Клиент отправляет сообщение, обрабатываем его в банке
            bank.receiveMessage(message);
        } else if (sender == account) {
            // Счет отправляет сообщение, обрабатываем его в клиенте
            client.receiveMessage(message);
        } else if (sender == bank) {
            // Банк отправляет сообщение, обрабатываем его в счете
            account.receiveMessage(message);
        }
    }
}
