package Mediator.medium;

// Пример использования
public class BankMediatorExample {
    public static void main(String[] args) {
        // Создаем посредника
        BankMediatorImpl mediator = new BankMediatorImpl();

        // Создаем компоненты
        Client client = new Client(mediator, "John Doe");
        Account account = new Account(mediator, "123456789");
        Bank bank = new Bank(mediator);

        // Устанавливаем компоненты в посреднике
        mediator.setClient(client);
        mediator.setAccount(account);
        mediator.setBank(bank);

        // Клиент отправляет сообщение
        client.sendMessage("Deposit 500");

        // Банк отправляет сообщение
        bank.sendMessage("Transaction approved");

        // Счет отправляет сообщение
        account.sendMessage("Balance updated");
    }
}
