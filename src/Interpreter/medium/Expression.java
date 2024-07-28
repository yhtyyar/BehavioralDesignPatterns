package Interpreter.medium;

import java.util.Map;

interface Expression {
    double interpret(Map<String, Double> context);
}
