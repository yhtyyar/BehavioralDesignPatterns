package Interpreter.medium;

import java.util.Map;

// Конкретное выражение для операции вычитания
class SubtractExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public SubtractExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public double interpret(Map<String, Double> context) {
        return leftExpression.interpret(context) - rightExpression.interpret(context);
    }
}
