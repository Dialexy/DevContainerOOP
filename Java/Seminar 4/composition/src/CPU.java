public class CPU {
  private final String brand;
  private final double clockSpeed;
  private final int cores;

  public CPU(String brand, double clockSpeed, int cores) {
    this.brand = brand;
    this.clockSpeed = clockSpeed;
    this.cores = cores;
    System.out.println("CPU created: " + brand);
  }

  public void process() {
    System.out.println("Brand " + brand + "CPU is processing at " + clockSpeed + " GHz with " + cores + " cores.");
  }

  public String getSpecification() {
    return String.format("%s - %.2f GHz, %d cores", brand, clockSpeed, cores);
  }

}
