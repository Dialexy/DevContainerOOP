public class AlarmSystem implements NotificationObserver {
    private final String alarmId;

    public AlarmSystem(String alarmId) {
        this.alarmId = alarmId;
    }

    @Override
    public void update(String message) {
        if (!message.contains("temperature")) {
            System.out.printf("[Alarm: %s] - Alert: %s%n", alarmId, message);
        }
    }
}
