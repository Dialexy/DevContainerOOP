public class TemperatureTrendDisplay implements WeatherObserver {

    private Double lastTemperature = null;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        if (lastTemperature == null) {
            lastTemperature = temperature;
            return;
        }

        if (lastTemperature == temperature) {
            System.out.println("Temperature Trend: UNCHANGED");
        }
        else if (lastTemperature < temperature) {
            System.out.println("Temperature Trend: UP");
        }
        else {
            System.out.println("Temperature Trend: DOWN");
        }

        lastTemperature = temperature;
    }
}
