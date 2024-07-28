//package Iterator;
//
//public class MediumCode {
//}
//
//
//// В данном примере мы создадим итератор для перебора списка банковских счетов.
//
//// Интерфейс итератора
//interface AccountIterator {
//    boolean hasNext();
//    Account next();
//}
//
//// Конкретный итератор для списка счетов
//class ListAccountIterator implements AccountIterator {
//    private List<Account> accounts;
//    private int index;
//
//    public ListAccountIterator(List<Account> accounts) {
//        this.accounts = accounts;
//        this.index = 0;
//    }
//
//    @Override
//    public boolean hasNext() {
//        return index < accounts.size();
//    }
//
//    @Override
//    public Account next() {
//        if (hasNext()) {
//            return accounts.get(index++);
//        }
//        return null;
//    }
//}
//
//// Интерфейс коллекции
//interface AccountCollection {
//    void addAccount(Account account);
//    void removeAccount(Account account);
//    AccountIterator iterator();
//}
//
//// Конкретная коллекция для списка счетов
//class ListAccountCollection implements AccountCollection {
//    private List<Account> accounts;
//
//    public ListAccountCollection() {
//        this.accounts = new ArrayList<>();
//    }
//
//    @Override
//    public void addAccount(Account account) {
//        accounts.add(account);
//    }
//
//    @Override
//    public void removeAccount(Account account) {
//        accounts.remove(account);
//    }
//
//    @Override
//    public AccountIterator iterator() {
//        return new ListAccountIterator(accounts);
//    }
//}
//
//// Класс счета
//class Account {
//    private String accountNumber;
//    private double balance;
//
//    public Account(String accountNumber, double balance) {
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    @Override
//    public String toString() {
//        return "Account{" +
//                "accountNumber='" + accountNumber + '\'' +
//                ", balance=" + balance +
//                '}';
//    }
//}
//
//// Пример использования
//public class BankIteratorExample {
//    public static void main(String[] args) {
//        // Создаем коллекцию счетов
//        AccountCollection accountCollection = new ListAccountCollection();
//
//        // Добавляем счета в коллекцию
//        accountCollection.addAccount(new Account("123456789", 1000.0));
//        accountCollection.addAccount(new Account("987654321", 2000.0));
//        accountCollection.addAccount(new Account("112233445", 1500.0));
//
//        // Получаем итератор и перебираем счета
//        AccountIterator iterator = accountCollection.iterator();
//        while (iterator.hasNext()) {
//            Account account = iterator.next();
//            System.out.println(account);
//        }
//    }
//}
//
//// В этом примере мы создали итератор для перебора списка банковских счетов. Интерфейс AccountIterator определяет
//// методы hasNext и next для последовательного доступа к элементам. Конкретный итератор ListAccountIterator
//// реализует эти методы для работы со списком счетов.
////
////Интерфейс AccountCollection определяет методы для добавления и удаления счетов, а также для получения итератора.
//// Конкретная коллекция ListAccountCollection реализует эти методы для работы со списком счетов.
////
////В main методе мы создаем коллекцию счетов, добавляем в нее несколько счетов и используем итератор для перебора
//// и вывода информации о каждом счете.
