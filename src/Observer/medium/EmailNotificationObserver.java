package Observer.medium;

// Конкретный наблюдатель - уведомление по email
class EmailNotificationObserver implements AccountObserver {
    private String email;

    public EmailNotificationObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(Account account) {
        System.out.println("Sending email to " + email + ": Account balance changed to " + account.getBalance());
    }
}
