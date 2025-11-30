public class PressureAlertService implements WeatherObserver {

    private Double lastPressure = null;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        if (lastPressure == null) {
            lastPressure = pressure;
            return;
        }

        double pressureChange = pressure - lastPressure;
        if (pressureChange < -10) {
            System.out.println("WARNING: Rapid pressure drop detected!");
        }
        if (pressureChange > 10) {
            System.out.println("Pressure surge detected.");
        }

        lastPressure = pressure;
    }
}
