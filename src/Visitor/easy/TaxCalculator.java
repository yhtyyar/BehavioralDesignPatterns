package Visitor.easy;

// Конкретный Посетитель: Рассчитыватель налогов
class TaxCalculator implements Visitor {
    @Override
    public void visit(SavingsAccount savingsAccount) {
        double tax = savingsAccount.getBalance() * 0.1; // 10% налог
        System.out.println("Налог для Сберегательного счёта: " + tax);
    }

    @Override
    public void visit(CurrentAccount currentAccount) {
        double tax = currentAccount.getBalance() * 0.15; // 15% налог
        System.out.println("Налог для Текущего счёта: " + tax);
    }
}
