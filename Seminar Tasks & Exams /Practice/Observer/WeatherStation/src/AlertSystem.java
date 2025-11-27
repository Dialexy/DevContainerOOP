public class AlertSystem implements WeatherObserver {
    @Override
    public void update(double temp) {
        if (temp > 35) {
            System.out.println("Yo, my famalam. Go back inside styllll");
        }
        else {
            System.out.println("It's a stead tempreature G, enjoy your ting stylll");
        }
    }
}
