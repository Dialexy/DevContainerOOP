public class Unicorn extends Pet {
  private final int glitterLevel;

  public Unicorn (String name, int age, double baseFee, int glitterLevel) {
    super (name, age, baseFee);
    this.glitterLevel = glitterLevel;
  }

  @Override
  public double calculateDailyCost() {
    return baseFee + (glitterLevel * 30);
  }

  @Override
  public void makeSound() {
    System.out.println("Neigh... ✨sparkle sparkle✨");
  }

}
