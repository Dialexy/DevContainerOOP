public class Computer {
  private final CPU cpu;
  private final RAM ram;
  private final HardDrive hardDrive;

  public Computer(CPU cpu, RAM ram, HardDrive hardDrive) {
    this.cpu = cpu;
    this.ram = ram;
    this.hardDrive = hardDrive;
    System.out.println("Computer assembled with CPU: " + cpu.getSpecification() + ", RAM: " + ram.getSpecification() + ", Hard Drive: " + hardDrive.getSpecification());
  }

  public void start() {
    System.out.println("Computer is starting...");
    ram.load();
    cpu.process();
    hardDrive.readData();
  }
}
