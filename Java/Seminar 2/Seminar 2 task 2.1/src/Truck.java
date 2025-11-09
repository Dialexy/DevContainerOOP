public class Truck extends Vehicle {
  private double cargo;
  private double fuelEff;

  public double getFuelEff() {
    return fuelEff;
  }

  public Truck (double cargo, double fuelEff) {
    this.setCargo(cargo);
    this.fuelEff = fuelEff;
  }

  public void setCargo(double newCargo) {
    if (newCargo < 0 || newCargo > 3000) {
      throw new IllegalArgumentException ("Cargo must be between 0 - 3000 (Kg)");
    }
    this.cargo = newCargo;
  }

  @Override
  public double getFuelEfficiency() {
    return getFuelEff();
  }
}
