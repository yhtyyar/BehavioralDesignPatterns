package Visitor.medium;

// Интерфейс элемента
interface Account {
    void accept(AccountVisitor visitor);
}
