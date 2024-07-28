//package Visitor;
//
//public class MediumCode {
//}
//
//// В банковском приложении можно использовать паттерн "Посетитель" для выполнения различных операций над счетами
//// клиентов, таких как вычисление налогов, формирование отчетов и т.д.
//
//// Интерфейс элемента
//interface Account {
//    void accept(AccountVisitor visitor);
//}
//
//// Конкретные элементы
//class CheckingAccount implements Account {
//    private double balance;
//
//    public CheckingAccount(double balance) {
//        this.balance = balance;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    @Override
//    public void accept(AccountVisitor visitor) {
//        visitor.visit(this);
//    }
//}
//
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
//    public void accept(AccountVisitor visitor) {
//        visitor.visit(this);
//    }
//}
//
//// Интерфейс посетителя
//interface AccountVisitor {
//    void visit(CheckingAccount account);
//    void visit(SavingsAccount account);
//}
//
//// Конкретные посетители
//class TaxCalculator implements AccountVisitor {
//    @Override
//    public void visit(CheckingAccount account) {
//        double tax = account.getBalance() * 0.01;
//        System.out.println("Tax for checking account: " + tax);
//    }
//
//    @Override
//    public void visit(SavingsAccount account) {
//        double tax = account.getBalance() * 0.005;
//        System.out.println("Tax for savings account: " + tax);
//    }
//}
//
//class ReportGenerator implements AccountVisitor {
//    @Override
//    public void visit(CheckingAccount account) {
//        System.out.println("Report for checking account: Balance = " + account.getBalance());
//    }
//
//    @Override
//    public void visit(SavingsAccount account) {
//        System.out.println("Report for savings account: Balance = " + account.getBalance());
//    }
//}
//
//// Пример использования
//public class BankVisitorExample {
//    public static void main(String[] args) {
//        Account checkingAccount = new CheckingAccount(1000.0);
//        Account savingsAccount = new SavingsAccount(2000.0);
//
//        AccountVisitor taxCalculator = new TaxCalculator();
//        AccountVisitor reportGenerator = new ReportGenerator();
//
//        checkingAccount.accept(taxCalculator);
//        savingsAccount.accept(taxCalculator);
//
//        checkingAccount.accept(reportGenerator);
//        savingsAccount.accept(reportGenerator);
//    }
//}
//
//
////В этом примере:
////
////Account — интерфейс элемента, который определяет метод accept для приема посетителя.
////
////CheckingAccount и SavingsAccount — конкретные элементы, реализующие интерфейс Account.
////
////AccountVisitor — интерфейс посетителя, который определяет методы visit для каждого типа элемента.
////
////TaxCalculator и ReportGenerator — конкретные посетители, реализующие интерфейс AccountVisitor и выполняющие
//// операции над счетами.
////
////Таким образом, паттерн "Посетитель" позволяет добавлять новые операции к счетам без изменения их классов,
////что делает систему более гибкой и расширяемой.
//
//
//
//
