public class LifeCycleDemo {
  private static int totalObjects;
  private int Id;

  public LifeCycleDemo () {
    totalObjects++;
    Id = totalObjects;
    System.out.println("Object " + Id + " created.");
  }

  public static void createObject() {
    for (int i = 0; i < 10; i++) {
      LifeCycleDemo cycle = new LifeCycleDemo();
    }
  }

  @Override
  protected void finalize() throws Throwable {
    System.out.println("Object " + Id + " is being destroyed.");
  }

  @Override
  public String toString() {
    return "LifeCycleDemo[ID=" + Id + ", totalObjects=" + totalObjects + "]";
  }
}
