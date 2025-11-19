public class Engine {
  private final String engineType;

  public Engine (String engineType) {
    this.engineType = engineType;
  }

  public void start() {
    System.out.println("The engine has started");
  }

  public void stop() {
    System.out.println("The engine has stopped");
  }

  public void displayInfo() {
    System.out.println("This is a " + engineType);
  }
}
