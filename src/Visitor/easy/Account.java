package Visitor.easy;

// Интерфейс для Элементов, принимающих Посетителей
interface Account {
    void accept(Visitor visitor);
}

