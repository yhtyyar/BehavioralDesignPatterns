//package Visitor;
//
//public class EasyCode {
//}
//
//// Система расчета различных налогов для разных типов банковских счетов.
//
//// Интерфейс для Посетителя
//interface Visitor {
//    void visit(SavingsAccount savingsAccount);
//    void visit(CurrentAccount currentAccount);
//}
//
//// Интерфейс для Элементов, принимающих Посетителей
//interface Account {
//    void accept(Visitor visitor);
//}
//
//// Конкретная реализация банковского счета: Сберегательный счет
//class SavingsAccount implements Account {
//    private double balance;
//
//    public SavingsAccount(double balance) {
//        this.balance = balance;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    @Override
//    public void accept(Visitor visitor) {
//        visitor.visit(this);
//    }
//}
//
//// Конкретная реализация банковского счета: Текущий счет
//class CurrentAccount implements Account {
//    private double balance;
//
//    public CurrentAccount(double balance) {
//        this.balance = balance;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    @Override
//    public void accept(Visitor visitor) {
//        visitor.visit(this);
//    }
//}
//
//// Конкретный Посетитель: Рассчитыватель налогов
//class TaxCalculator implements Visitor {
//    @Override
//    public void visit(SavingsAccount savingsAccount) {
//        double tax = savingsAccount.getBalance() * 0.1; // 10% налог
//        System.out.println("Налог для Сберегательного счёта: " + tax);
//    }
//
//    @Override
//    public void visit(CurrentAccount currentAccount) {
//        double tax = currentAccount.getBalance() * 0.15; // 15% налог
//        System.out.println("Налог для Текущего счёта: " + tax);
//    }
//}
//
//// Клиент
//public class BankVisitorExample {
//    public static void main(String[] args) {
//        Account savingsAccount = new SavingsAccount(2000);
//        Account currentAccount = new CurrentAccount(3000);
//
//        Visitor taxCalculator = new TaxCalculator();
//
//        savingsAccount.accept(taxCalculator); // Налог для Сберегательного счёта: 200.0
//        currentAccount.accept(taxCalculator);  // Налог для Текущего счёта: 450.0
//    }
//}
//
//
////Паттерн "Посетитель" в данном примере позволяет легко добавлять новые операции (например, расчет налогов)
//// для различных типов банковских счетов, не изменяя их внутреннюю структуру. Это повышает гибкость и
//// расширяемость системы, упрощая процесс добавления новых функциональностей, что критично для динамично
//// развивающихся банковских приложений.
//
