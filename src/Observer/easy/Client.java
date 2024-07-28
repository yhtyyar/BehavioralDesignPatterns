package Observer.easy;

// Конкретный Наблюдатель: Клиент
class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(double balance) {
        System.out.println(name + " уведомлён о новом балансе: " + balance);
    }
}

