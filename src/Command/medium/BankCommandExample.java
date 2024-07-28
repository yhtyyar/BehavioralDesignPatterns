package Command.medium;

// Пример использования
public class BankCommandExample {
    public static void main(String[] args) {
        // Создаем счет
        Account account = new Account("123456789", 1000.0);

        // Создаем команды
        Command depositCommand = new DepositCommand(account, 500.0);
        Command withdrawCommand = new WithdrawCommand(account, 200.0);
        Command checkBalanceCommand = new CheckBalanceCommand(account);

        // Создаем банк и выполняем команды
        Bank bank = new Bank();
        bank.executeCommand(depositCommand);
        bank.executeCommand(withdrawCommand);
        bank.executeCommand(checkBalanceCommand);
    }
}
