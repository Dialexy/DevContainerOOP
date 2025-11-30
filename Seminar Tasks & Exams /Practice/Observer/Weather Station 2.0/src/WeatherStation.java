import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherSubject {
    private double temperature;
    private double humidity;
    private double pressure;
    private final List<WeatherObserver> observers = new ArrayList<>();

    public void setMeasurements(double newTemperature, double newHumidity, double newPressure) {
        temperature = newTemperature;
        humidity = newHumidity;
        pressure = newPressure;
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(WeatherObserver obs) {
        observers.add(obs);
    }

    @Override
    public void deregisterObserver(WeatherObserver obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
