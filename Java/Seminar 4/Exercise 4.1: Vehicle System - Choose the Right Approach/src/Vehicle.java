import java.util.ArrayList;

public class Vehicle {
  private final String make;
  private final String model;
  private String color;
  private double price;
  private Engine engine;
  private Transmission transmission;
  private final ArrayList<String> addOns = new ArrayList<>();

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public double getPrice() {
    return price;
  }

  public Engine getEngine() {
    return engine;
  }

  public Transmission getTransmission() {
    return transmission;
  }

  public Vehicle (String make, String model, Engine engineType, Transmission transmission) {
    this.make = make;
    this.model = model;
    this.engine = engineType;
    this.transmission = transmission;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setEngine(Engine engineType) {
    this.engine = engineType;
  }

  public void setTransmission(Transmission transmission) {
    this.transmission = transmission;
  }

  public void addFeatures(String feature) {
    addOns.add(feature);
  }

  public void removeFeatures(String feature) {
    addOns.remove(feature);
  }

  public void showAddOns() {
    System.out.println("Current " + getClass().getSimpleName() + " add-ons: " + addOns);
  }
}
