public class Motorcycle extends Vehicle {
  private String licensePlate;
  private double fuelEff;
  private String licenseType;

  public double getFuelEff() {
    return fuelEff;
  }

  public Motorcycle (String licensePlate, double fuelEff, String licenseType) {
    this.setLicensePlateType(licensePlate);
    this.fuelEff = fuelEff;
    this.setLicenseType(licenseType);
  }

  public void setLicenseType(String newLicenseType) {
    if (newLicenseType == null || newLicenseType.trim().isEmpty()) {
      throw new IllegalArgumentException ("You need to enter a valid drivers license");
    }
    String licenseTypePattern = "^(A1|A2|A3)$";
      if (!newLicenseType.matches(licenseTypePattern)) {
        throw new IllegalArgumentException ("You must have a motorcycle license to drive this vehicle");
      }
      this.licenseType = newLicenseType;
  }

  public void setLicensePlateType(String newLicensePlate) {    // This is not what the assigment is asking for, I read it wrong (Licence not Licence plate)
    if (newLicensePlate == null || newLicensePlate.trim().isEmpty()) {
      throw new IllegalArgumentException ("License plate catagory must be filled");
    }
    String licensePlatePattern = "^[A-Z]{2}[0-9]{2}\\s?[A-Z]{3}$";
      if (!newLicensePlate.matches(licensePlatePattern)) {
        throw new IllegalArgumentException ("The license plate must be of United Kingdom format");
      }
      this.licensePlate = newLicensePlate;
  }

  @Override
  public double getFuelEfficiency() {
    return getFuelEff();
  }
}


