public interface WeatherSubject {
    void registerObserver(WeatherObserver o);
    void deregisterObserver(WeatherObserver o);
    void notifyObservers();
}
