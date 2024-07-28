//package Mediator;
//
//public class MediumCode {
//}
//
////В данном примере мы создадим посредника для управления взаимодействием между различными компонентами
//// банковского приложения, такими как клиент, счет и банк.
//
//// Интерфейс посредника
//interface BankMediator {
//    void sendMessage(String message, BankComponent sender);
//}
//
//// Конкретный посредник
//class BankMediatorImpl implements BankMediator {
//    private Client client;
//    private Account account;
//    private Bank bank;
//
//    public void setClient(Client client) {
//        this.client = client;
//    }
//
//    public void setAccount(Account account) {
//        this.account = account;
//    }
//
//    public void setBank(Bank bank) {
//        this.bank = bank;
//    }
//
//    @Override
//    public void sendMessage(String message, BankComponent sender) {
//        if (sender == client) {
//            // Клиент отправляет сообщение, обрабатываем его в банке
//            bank.receiveMessage(message);
//        } else if (sender == account) {
//            // Счет отправляет сообщение, обрабатываем его в клиенте
//            client.receiveMessage(message);
//        } else if (sender == bank) {
//            // Банк отправляет сообщение, обрабатываем его в счете
//            account.receiveMessage(message);
//        }
//    }
//}
//
//// Интерфейс компонента
//abstract class BankComponent {
//    protected BankMediator mediator;
//
//    public BankComponent(BankMediator mediator) {
//        this.mediator = mediator;
//    }
//
//    public abstract void sendMessage(String message);
//    public abstract void receiveMessage(String message);
//}
//
//// Конкретный компонент - клиент
//class Client extends BankComponent {
//    private String name;
//
//    public Client(BankMediator mediator, String name) {
//        super(mediator);
//        this.name = name;
//    }
//
//    @Override
//    public void sendMessage(String message) {
//        System.out.println(name + " sends: " + message);
//        mediator.sendMessage(message, this);
//    }
//
//    @Override
//    public void receiveMessage(String message) {
//        System.out.println(name + " receives: " + message);
//    }
//}
//
//// Конкретный компонент - счет
//class Account extends BankComponent {
//    private String accountNumber;
//
//    public Account(BankMediator mediator, String accountNumber) {
//        super(mediator);
//        this.accountNumber = accountNumber;
//    }
//
//    @Override
//    public void sendMessage(String message) {
//        System.out.println("Account " + accountNumber + " sends: " + message);
//        mediator.sendMessage(message, this);
//    }
//
//    @Override
//    public void receiveMessage(String message) {
//        System.out.println("Account " + accountNumber + " receives: " + message);
//    }
//}
//
//// Конкретный компонент - банк
//class Bank extends BankComponent {
//    public Bank(BankMediator mediator) {
//        super(mediator);
//    }
//
//    @Override
//    public void sendMessage(String message) {
//        System.out.println("Bank sends: " + message);
//        mediator.sendMessage(message, this);
//    }
//
//    @Override
//    public void receiveMessage(String message) {
//        System.out.println("Bank receives: " + message);
//    }
//}
//
//// Пример использования
//public class BankMediatorExample {
//    public static void main(String[] args) {
//        // Создаем посредника
//        BankMediatorImpl mediator = new BankMediatorImpl();
//
//        // Создаем компоненты
//        Client client = new Client(mediator, "John Doe");
//        Account account = new Account(mediator, "123456789");
//        Bank bank = new Bank(mediator);
//
//        // Устанавливаем компоненты в посреднике
//        mediator.setClient(client);
//        mediator.setAccount(account);
//        mediator.setBank(bank);
//
//        // Клиент отправляет сообщение
//        client.sendMessage("Deposit 500");
//
//        // Банк отправляет сообщение
//        bank.sendMessage("Transaction approved");
//
//        // Счет отправляет сообщение
//        account.sendMessage("Balance updated");
//    }
//}
//
//
//// В этом примере мы создали посредника для управления взаимодействием между клиентом, счетом и банком.
//// Интерфейс BankMediator определяет метод sendMessage, который принимает сообщение и отправителя. Конкретный
//// посредник BankMediatorImpl реализует этот метод, перенаправляя сообщения между компонентами.
////
////Интерфейс BankComponent определяет методы sendMessage и receiveMessage для отправки и получения сообщений.
//// Конкретные компоненты (Client, Account, Bank) реализуют эти методы для взаимодействия с посредником.
////
////В main методе мы создаем посредника и компоненты, устанавливаем компоненты в посреднике, а затем отправляем
//// сообщения между компонентами через посредника.
