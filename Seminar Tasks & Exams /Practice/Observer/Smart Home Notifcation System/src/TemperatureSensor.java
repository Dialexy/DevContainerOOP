public class TemperatureSensor extends Sensor {

    @Override
    public void notifyObservers() {
        if (getTemperature() > 30 || getTemperature() < 0) {
            for (NotificationObserver observer : observers) {
                observer.update("Temperture alert: " + getTemperature() + "°C");
            }
        }
    }
}
