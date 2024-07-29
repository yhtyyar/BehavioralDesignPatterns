//package State;
//
//public class EasyCode {
//}
//
//// Управление состоянием банковского счёта (активный, заблокированный).
//
//// Интерфейс состояния
//interface AccountState {
//    void deposit(double amount);
//    void withdraw(double amount);
//    void displayStatus();
//}
//
//// Конкретное состояние: Активный счёт
//class ActiveState implements AccountState {
//    private BankAccount account;
//
//    public ActiveState(BankAccount account) {
//        this.account = account;
//    }
//
//    @Override
//    public void deposit(double amount) {
//        account.setBalance(account.getBalance() + amount);
//        System.out.println("Депозит: " + amount + ". Баланс: " + account.getBalance());
//    }
//
//    @Override
//    public void withdraw(double amount) {
//        if (amount > account.getBalance()) {
//            System.out.println("Недостаточно средств для снятия: " + amount);
//        } else {
//            account.setBalance(account.getBalance() - amount);
//            System.out.println("Снятие: " + amount + ". Баланс: " + account.getBalance());
//        }
//    }
//
//    @Override
//    public void displayStatus() {
//        System.out.println("Счёт активен.");
//    }
//}
//
//// Конкретное состояние: Заблокированный счёт
//class BlockedState implements AccountState {
//    private BankAccount account;
//
//    public BlockedState(BankAccount account) {
//        this.account = account;
//    }
//
//    @Override
//    public void deposit(double amount) {
//        System.out.println("Счёт заблокирован. Депозиты невозможны.");
//    }
//
//    @Override
//    public void withdraw(double amount) {
//        System.out.println("Счёт заблокирован. Снятия невозможны.");
//    }
//
//    @Override
//    public void displayStatus() {
//        System.out.println("Счёт заблокирован.");
//    }
//}
//
//// Контекст: Банковский счёт
//class BankAccount {
//    private double balance;
//    private AccountState state;
//
//    public BankAccount() {
//        this.balance = 0;
//        this.state = new ActiveState(this);
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public void setState(AccountState state) {
//        this.state = state;
//    }
//
//    public void deposit(double amount) {
//        state.deposit(amount);
//    }
//
//    public void withdraw(double amount) {
//        state.withdraw(amount);
//    }
//
//    public void displayStatus() {
//        state.displayStatus();
//    }
//}
//
//// Клиент
//public class BankStateExample {
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount();
//        account.displayStatus(); // Счёт активен.
//
//        account.deposit(1500); // Депозит: 1500. Баланс: 1500
//        account.withdraw(400);  // Снятие: 400. Баланс: 1100
//
//        // Перевод счета в заблокированное состояние
//        account.setState(new BlockedState(account));
//        account.displayStatus(); // Счёт заблокирован.
//
//        account.deposit(500); // Счёт заблокирован. Депозиты невозможны.
//        account.withdraw(200); // Счёт заблокирован. Снятия невозможны.
//    }
//}
//
////Паттерн "Состояние" в данном примере позволяет контролировать поведение банковского счёта в зависимости от
//// его состояния (активный или заблокированный). Это упрощает код, избегая большого числа условных операторов,
//// и позволяет легко добавлять новые состояния в будущем, что делает систему более гибкой и поддерживаемой.
