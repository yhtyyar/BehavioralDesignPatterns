package Iterator.easy;

// Интерфейс итератора
interface Iterator<T> {
    boolean hasNext();
    T next();
}
