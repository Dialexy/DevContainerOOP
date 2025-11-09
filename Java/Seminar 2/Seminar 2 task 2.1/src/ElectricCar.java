public class ElectricCar extends Car {
  private double batteryCapacity;

  public double getBatteryCapacity() {
    return batteryCapacity;
  }

  public ElectricCar (int passengerAmount, double fuelEff, double batteryCapacity) {
    super(passengerAmount, fuelEff);
    this.batteryCapacity = batteryCapacity;
  }


  @Override
  public double getFuelEfficiency() {
    return batteryCapacity;
  }
}
