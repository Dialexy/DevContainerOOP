import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private double temp;
    private final List<WeatherObserver> observers = new ArrayList<>();

    public double getTemp() {
        return temp;
    }

    public void setTemp(double newTemp) {
        temp = newTemp;
    }

    public void subscribe(WeatherObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(WeatherObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (WeatherObserver obs : observers) {
            obs.update(temp);
        }
    }

}
