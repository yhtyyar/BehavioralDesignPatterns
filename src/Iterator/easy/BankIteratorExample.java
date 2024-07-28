package Iterator.easy;

// Клиент
public class BankIteratorExample {
    public static void main(String[] args) {
        BankAccountList bankAccountList = new BankAccountList();

        bankAccountList.addAccount(new BankAccount("123", 1000));
        bankAccountList.addAccount(new BankAccount("456", 500));
        bankAccountList.addAccount(new BankAccount("789", 750));

        Iterator<BankAccount> iterator = bankAccountList.createIterator();

        while (iterator.hasNext()) {
            BankAccount account = iterator.next();
            System.out.println(account); // Вывод информации о каждом счёте
        }
    }
}
