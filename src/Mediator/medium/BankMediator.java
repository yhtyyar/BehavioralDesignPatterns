package Mediator.medium;

// Интерфейс посредника
interface BankMediator {
    void sendMessage(String message, BankComponent sender);
}
