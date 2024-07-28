package Memento.easy;

import java.util.ArrayList;
import java.util.List;

// Класс Хранитель состояний (Caretaker)
class AccountCaretaker {
    private final List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}
