//package Interpreter;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class MediumCode {
//}
//
//
//
//
//
//
////В данном примере мы создадим простой язык для выполнения банковских операций, таких как пополнение счета,
//// снятие средств и проверка баланса.
//
//
//// Интерфейс выражения
//interface Expression {
//    double interpret(Map<String, Double> context);
//}
//
//// Конкретное выражение для чисел
//class NumberExpression implements Expression {
//    private double number;
//
//    public NumberExpression(double number) {
//        this.number = number;
//    }
//
//    @Override
//    public double interpret(Map<String, Double> context) {
//        return number;
//    }
//}
//
//// Конкретное выражение для переменных
//class VariableExpression implements Expression {
//    private String variableName;
//
//    public VariableExpression(String variableName) {
//        this.variableName = variableName;
//    }
//
//    @Override
//    public double interpret(Map<String, Double> context) {
//        return context.getOrDefault(variableName, 0.0);
//    }
//}
//
//// Конкретное выражение для операции сложения
//class AddExpression implements Expression {
//    private Expression leftExpression;
//    private Expression rightExpression;
//
//    public AddExpression(Expression leftExpression, Expression rightExpression) {
//        this.leftExpression = leftExpression;
//        this.rightExpression = rightExpression;
//    }
//
//    @Override
//    public double interpret(Map<String, Double> context) {
//        return leftExpression.interpret(context) + rightExpression.interpret(context);
//    }
//}
//
//// Конкретное выражение для операции вычитания
//class SubtractExpression implements Expression {
//    private Expression leftExpression;
//    private Expression rightExpression;
//
//    public SubtractExpression(Expression leftExpression, Expression rightExpression) {
//        this.leftExpression = leftExpression;
//        this.rightExpression = rightExpression;
//    }
//
//    @Override
//    public double interpret(Map<String, Double> context) {
//        return leftExpression.interpret(context) - rightExpression.interpret(context);
//    }
//}
//
//// Пример использования
//public class BankInterpreterExample {
//    public static void main(String[] args) {
//        // Создаем контекст с начальным балансом
//        Map<String, Double> context = new HashMap<>();
//        context.put("balance", 1000.0);
//
//        // Создаем выражения
//        Expression initialBalance = new VariableExpression("balance");
//        Expression depositAmount = new NumberExpression(500.0);
//        Expression withdrawAmount = new NumberExpression(200.0);
//
//        // Создаем операции
//        Expression newBalance = new AddExpression(initialBalance, depositAmount);
//        newBalance = new SubtractExpression(newBalance, withdrawAmount);
//
//        // Интерпретируем выражение
//        double finalBalance = newBalance.interpret(context);
//        System.out.println("Final balance: " + finalBalance);
//    }
//}
//
//// В этом примере мы создали простой язык для выполнения банковских операций. Интерфейс Expression определяет
//// метод interpret, который принимает контекст (карту переменных и их значений). Конкретные выражения
//// (NumberExpression, VariableExpression, AddExpression, SubtractExpression) реализуют этот интерфейс
//// для выполнения соответствующих операций.
////
////В main методе мы создаем контекст с начальным балансом, создаем выражения для пополнения и снятия средств,
//// а затем интерпретируем их для получения нового баланса.
