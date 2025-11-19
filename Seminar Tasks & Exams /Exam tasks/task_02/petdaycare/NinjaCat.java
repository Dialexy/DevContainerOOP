public class NinjaCat extends Pet {
  private final int stealthLevel;

  public NinjaCat (String name, int age, double baseFee, int stealthLevel) {
    super (name, age, baseFee);
    this.stealthLevel = stealthLevel;
  }

  @Override
  public double calculateDailyCost() {
    return baseFee - (stealthLevel * 10);
   }

  @Override
  public void makeSound() {
    System.out.println("...");
  }

  }
