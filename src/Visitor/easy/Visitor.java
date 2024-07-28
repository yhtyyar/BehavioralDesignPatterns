package Visitor.easy;

// Интерфейс для Посетителя
interface Visitor {
    void visit(SavingsAccount savingsAccount);
    void visit(CurrentAccount currentAccount);
}
