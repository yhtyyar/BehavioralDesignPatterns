package Interpreter.medium;

import java.util.HashMap;
import java.util.Map;

// Пример использования
public class BankInterpreterExample {
    public static void main(String[] args) {
        // Создаем контекст с начальным балансом
        Map<String, Double> context = new HashMap<>();
        context.put("balance", 1000.0);

        // Создаем выражения
        Expression initialBalance = new VariableExpression("balance");
        Expression depositAmount = new NumberExpression(500.0);
        Expression withdrawAmount = new NumberExpression(200.0);

        // Создаем операции
        Expression newBalance = new AddExpression(initialBalance, depositAmount);
        newBalance = new SubtractExpression(newBalance, withdrawAmount);

        // Интерпретируем выражение
        double finalBalance = newBalance.interpret(context);
        System.out.println("Final balance: " + finalBalance);
    }
}
