package Interpreter.medium;

import java.util.Map;

// Конкретное выражение для чисел
class NumberExpression implements Expression {
    private double number;

    public NumberExpression(double number) {
        this.number = number;
    }

    @Override
    public double interpret(Map<String, Double> context) {
        return number;
    }
}
