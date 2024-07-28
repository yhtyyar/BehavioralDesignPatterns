package Memento.medium;

// Опекун, который управляет сохранением и восстановлением состояния
class AccountCareTaker {
    private AccountMemento memento;

    public void saveMemento(AccountMemento memento) {
        this.memento = memento;
    }

    public AccountMemento retrieveMemento() {
        return memento;
    }
}
