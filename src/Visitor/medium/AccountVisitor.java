package Visitor.medium;

// Интерфейс посетителя
interface AccountVisitor {
    void visit(CheckingAccount account);
    void visit(SavingsAccount account);
}
