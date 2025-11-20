public abstract class Vehicle {

  protected String make;
  protected String model;
  protected int year;
  protected double fuelCapacity;

  public void start() {
    System.out.println("The vehicle has started");
  }

  public void stop() {
    System.out.println("The vehicle has stopped");
  }

  public abstract double getFuelEfficiency();
}
