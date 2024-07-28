package Observer.medium;

// Конкретный наблюдатель - уведомление по SMS
class SMSNotificationObserver implements AccountObserver {
    private String phoneNumber;

    public SMSNotificationObserver(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(Account account) {
        System.out.println("Sending SMS to " + phoneNumber + ": Account balance changed to " + account.getBalance());
    }
}
