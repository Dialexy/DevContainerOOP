public class HardDrive {
  private final int capacity;
  private final String type;

  public HardDrive(int capacity, String type) {
    this.capacity = capacity;
    this.type = type;
    System.out.println("The hard drive has been installed: " + capacity + "GB " + type);
  }

  public void readData() {
    System.out.println("The drive is reading data");
  }

  public void writeData() {
    System.out.println("The drive is writing data");
  }

  public String getSpecification() {
    return String.format("%dGB %s", capacity, type);
  }
}
