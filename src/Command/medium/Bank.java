package Command.medium;

// Класс, который будет вызывать команды
class Bank {
    public void executeCommand(Command command) {
        command.execute();
    }
}
