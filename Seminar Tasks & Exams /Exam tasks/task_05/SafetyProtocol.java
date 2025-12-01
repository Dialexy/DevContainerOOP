public class SafetyProtocol implements ReactorObserver {
    private boolean isAlarmActive;
    private final double ALARM_THRESHOLD = 500.0;

    public boolean isAlarmActive() {
        return isAlarmActive;
    }

    @Override
    public void update(double temperature) {
        if (temperature >= ALARM_THRESHOLD) {
            if (!isAlarmActive) {
                isAlarmActive = true;
            }
            System.err.println("CRTICAL WARNING: The temperature has exceeded 500.0K!");
        }
        if (temperature < ALARM_THRESHOLD) {
            if (isAlarmActive) {
                isAlarmActive = false;
                System.out.println("Safety Protocol: Alarm deactivated. Tempreture is below 500.0k.");
            }
        }

    }
}
