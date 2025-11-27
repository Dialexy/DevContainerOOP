import java.util.ArrayList;
import java.util.List;

public abstract class Sensor {
    private double temperature;
    private boolean isDoorOpen;
    private boolean isThereSmoke;
    protected final List<NotificationObserver> observers = new ArrayList<>();

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double newTemperature) {
        temperature = newTemperature;
        notifyObservers();
    }

    public boolean getIsThereSmoke() {
        return isThereSmoke;
    }

    public void setIsThereSmoke() {
        if (temperature > 60) {
            isThereSmoke = true;
            notifyObservers();
        }
        else {
            isThereSmoke = false;
        }
    }

    public boolean getIsDoorOpen() {
        return isDoorOpen;
    }

    public void setIsDoorOpen(boolean newIsDoorOpen) {
        isDoorOpen = newIsDoorOpen;
        notifyObservers();
    }

    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }

    public abstract void notifyObservers();
}
