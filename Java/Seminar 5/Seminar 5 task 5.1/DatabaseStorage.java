public class DatabaseStorage implements DataStorage {
  private String data;

  public String getData() {
    return data;
  }

  @Override
  public void writeData (String data) {
    System.out.println("Writing data to: " + data);
  }

  public String readData (String key) {
    return "Data from file";
  }
}
