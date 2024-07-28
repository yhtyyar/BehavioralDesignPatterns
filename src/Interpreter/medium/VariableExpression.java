package Interpreter.medium;

import java.util.Map;

// Конкретное выражение для переменных
class VariableExpression implements Expression {
    private String variableName;

    public VariableExpression(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public double interpret(Map<String, Double> context) {
        return context.getOrDefault(variableName, 0.0);
    }
}
