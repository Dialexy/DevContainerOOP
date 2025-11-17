public abstract class Pet {
  protected String name;
  protected int age;
  protected double baseFee;

  public Pet (String name, int age, double baseFee) {
    this.name = name;
    this.age = age;
    this.baseFee = baseFee;
  }

  public void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age + " years old");
  }

  public abstract double calculateDailyCost();
  public abstract void makeSound();
}
