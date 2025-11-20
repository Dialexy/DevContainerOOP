public class Car extends Vehicle {
  private int passengerAmount;
  private double fuelEff;

  public int getPassengerAmount() {
    return passengerAmount;
  }

  public double getFuelEff() {
    return fuelEff;
  }

  public Car (int passengerAmount, double fuelEff) {
    this.setPassengerAmount(passengerAmount);
    this.fuelEff = fuelEff;
  }

  public void setPassengerAmount (int newPassengerAmount) {
    if (newPassengerAmount < 0 || newPassengerAmount > 3) {
      throw new IllegalArgumentException ("The passenger amount must be between 0 - 3");
    }
    this.passengerAmount = newPassengerAmount;
  }

  @Override
  public double getFuelEfficiency() {
    return getFuelEff();
  }
}
