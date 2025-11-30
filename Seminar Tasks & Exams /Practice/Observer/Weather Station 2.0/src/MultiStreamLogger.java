import java.util.ArrayList;
import java.util.List;

public class MultiStreamLogger implements WeatherObserver {

    private final List<String> logs = new ArrayList<>();

    public List<String> getLogs() {
        return logs;
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        String log = "Temp: " + temperature + " Humidity: " + humidity +  " Pressure: " + pressure;
        logs.add(log);
    }
}
