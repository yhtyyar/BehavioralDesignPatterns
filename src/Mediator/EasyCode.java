//package Mediator;
//
//public class EasyCode {
//}
//
//
//// Использование посредника для управления клиентом и списком банковских счетов, включая итерацию по ним.
//
//
//// Интерфейс посредника
//interface Mediator {
//    void registerAccount(BankAccount account);
//    void displayAccounts();
//}
//
//// Конкретный посредник
//class BankMediator implements Mediator {
//    private List<BankAccount> accounts;
//
//    public BankMediator() {
//        accounts = new ArrayList<>();
//    }
//
//    @Override
//    public void registerAccount(BankAccount account) {
//        accounts.add(account);
//    }
//
//    @Override
//    public void displayAccounts() {
//        System.out.println("Список банковских счетов:");
//        for (BankAccount account : accounts) {
//            System.out.println(account);
//        }
//    }
//}
//
//// Класс для банковского счета
//class BankAccount {
//    private String accountNumber;
//    private double balance;
//
//    public BankAccount(String accountNumber, double initialBalance) {
//        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    @Override
//    public String toString() {
//        return "Счёт #" + accountNumber + " с балансом " + balance;
//    }
//}
//
//// Клиент
//public class BankMediatorExample {
//    public static void main(String[] args) {
//        BankMediator mediator = new BankMediator();
//
//        // Регистрация счетов через посредника
//        mediator.registerAccount(new BankAccount("123", 1000));
//        mediator.registerAccount(new BankAccount("456", 500));
//        mediator.registerAccount(new BankAccount("789", 750));
//
//        // Отображение счетов через посредника
//        mediator.displayAccounts();
//    }
//}
//
//// Паттерн "Посредник" в данном примере позволяет централизованно управлять взаимодействиями между клиентами и
//// списком банковских счетов. Он упрощает регистрацию счетов и их отображение без необходимости напрямую связывать
//// компоненты. Это повышает модульность и облегчает поддержку и расширение системы в будущем.
//
//
//
//
