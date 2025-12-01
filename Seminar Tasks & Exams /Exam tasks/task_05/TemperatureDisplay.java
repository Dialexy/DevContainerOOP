public class TemperatureDisplay implements ReactorObserver {
    private Double lastRecordedTemperature = null;

    public double getLastRecordedTemperature() {
        return lastRecordedTemperature;
    }

    @Override
    public void update(double temperature) {
        lastRecordedTemperature = temperature;
        System.out.printf("DISPLAY: Core Temperature Updated to %.2fK.%n", temperature);
    }
}
