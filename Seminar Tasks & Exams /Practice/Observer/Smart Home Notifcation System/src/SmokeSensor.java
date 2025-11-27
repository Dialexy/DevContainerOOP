public class SmokeSensor extends Sensor {

    @Override
    public void notifyObservers() {
        if (getIsThereSmoke()) {
            for (NotificationObserver observer : observers) {
                observer.update("There is smoke!");
            }
        }
    }
}
