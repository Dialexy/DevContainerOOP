public class RAM {
  private final int capacity;
  private final String type;

  public RAM(int capacity, String type) {
    this.capacity = capacity;
    this.type = type;
    System.out.println("RAM installed: " + capacity + "GB " + type);
  }

  public String getSpecification() {
    return String.format("%dGB %s", capacity, type);
  }

  public void load() {
    System.out.println("The data is loading.");
  }
}
