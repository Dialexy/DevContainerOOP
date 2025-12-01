import java.util.ArrayList;
import java.util.List;

public class ReactorCore {
    private final List<ReactorObserver> observers = new ArrayList<>();
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void attach(ReactorObserver observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void detach(ReactorObserver observer) {
        observers.remove(observer);
    }

    public void setTemperature(double newTemp) {
        temperature = newTemp;
        notifyObservers();
    }

    private void notifyObservers() {
        for (ReactorObserver observer : observers ) {
            observer.update(temperature);
        }
    }
}
