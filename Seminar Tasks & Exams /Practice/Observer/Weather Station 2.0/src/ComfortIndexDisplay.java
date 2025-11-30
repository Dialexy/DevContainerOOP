public class ComfortIndexDisplay implements WeatherObserver {

   @Override
   public void update(double temperature, double humidity, double pressure) {
        double index = (1.8 * temperature) - (0.55 * (1 - humidity/100) * (1.8 * temperature - 26)) + 32;
        System.out.printf("Comfort index: %f%n", index);
   }
}
