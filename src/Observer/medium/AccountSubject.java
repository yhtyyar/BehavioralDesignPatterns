package Observer.medium;

// Интерфейс наблюдаемого объекта
interface AccountSubject {
    void addObserver(AccountObserver observer);
    void removeObserver(AccountObserver observer);
    void notifyObservers();
}
