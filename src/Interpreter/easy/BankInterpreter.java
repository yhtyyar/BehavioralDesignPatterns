package Interpreter.easy;

// Класс интерпретатора
class BankInterpreter {
    private Expression command;

    public void setCommand(Expression command) {
        this.command = command;
    }

    public void interpret(BankAccount context) {
        command.interpret(context);
    }
}

