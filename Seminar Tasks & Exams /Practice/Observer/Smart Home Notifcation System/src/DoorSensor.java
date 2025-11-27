public class DoorSensor extends Sensor {

    @Override
    public void notifyObservers() {
        if (getIsDoorOpen()) {
            for (NotificationObserver observer : observers) {
                observer.update("There is an open open.");
            }
        }
    }
}
