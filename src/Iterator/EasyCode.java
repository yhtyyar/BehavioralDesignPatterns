//package Iterator;
//
//public class EasyCode {
//}
//
//
//
//// Итерация по списку банковских счетов для выполнения операций, таких как проверка баланса или применение процентов.
//
//// Интерфейс итератора
//interface Iterator<T> {
//    boolean hasNext();
//    T next();
//}
//
//// Интерфейс коллекции
//interface AccountCollection {
//    void addAccount(BankAccount account);
//    Iterator<BankAccount> createIterator();
//}
//
//// Конкретная коллекция: Список счетов
//class BankAccountList implements AccountCollection {
//    private List<BankAccount> accounts;
//
//    public BankAccountList() {
//        accounts = new ArrayList<>();
//    }
//
//    @Override
//    public void addAccount(BankAccount account) {
//        accounts.add(account);
//    }
//
//    @Override
//    public Iterator<BankAccount> createIterator() {
//        return new BankAccountIterator(accounts);
//    }
//}
//
//// Конкретный итератор
//class BankAccountIterator implements Iterator<BankAccount> {
//    private List<BankAccount> accounts;
//    private int position;
//
//    public BankAccountIterator(List<BankAccount> accounts) {
//        this.accounts = accounts;
//        position = 0;
//    }
//
//    @Override
//    public boolean hasNext() {
//        return position < accounts.size();
//    }
//
//    @Override
//    public BankAccount next() {
//        return accounts.get(position++);
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
//public class BankIteratorExample {
//    public static void main(String[] args) {
//        BankAccountList bankAccountList = new BankAccountList();
//
//        bankAccountList.addAccount(new BankAccount("123", 1000));
//        bankAccountList.addAccount(new BankAccount("456", 500));
//        bankAccountList.addAccount(new BankAccount("789", 750));
//
//        Iterator<BankAccount> iterator = bankAccountList.createIterator();
//
//        while (iterator.hasNext()) {
//            BankAccount account = iterator.next();
//            System.out.println(account); // Вывод информации о каждом счёте
//        }
//    }
//}
//
////Паттерн "Итератор" облегчает перебор элементов в коллекции банковских счетов, не раскрывая их внутреннюю структуру.
//// Это улучшает удобство работы с коллекциями и обеспечивает гибкость, позволяя менять реализацию и
//// структуру без вмешательства в код клиента, который использует итератор для доступа к данным.
//
//
