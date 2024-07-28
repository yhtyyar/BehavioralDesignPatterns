package Mediator.easy;

// Клиент
public class BankMediatorExample {
    public static void main(String[] args) {
        BankMediator mediator = new BankMediator();

        // Регистрация счетов через посредника
        mediator.registerAccount(new BankAccount("123", 1000));
        mediator.registerAccount(new BankAccount("456", 500));
        mediator.registerAccount(new BankAccount("789", 750));

        // Отображение счетов через посредника
        mediator.displayAccounts();
    }
}
