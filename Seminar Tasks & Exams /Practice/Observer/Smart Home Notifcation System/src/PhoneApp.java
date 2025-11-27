public class PhoneApp implements NotificationObserver {
    private final String phoneId;

    public PhoneApp(String phoneId) {
        this.phoneId = phoneId;
    }

    @Override
    public void update(String message) {
        System.out.printf("[Phone: %s] - Alert: %s%n", phoneId, message);
    }
}
