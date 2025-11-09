public class Counter {

  private int count = 0;

  public Counter () {
  }

  public void increment() {
    this.count++;
    System.out.println("The count has increased by one. The count is now: " + getCount());
  }

  public int getCount() {
    return count;
  }

  public void reset() {
    this.count = 0;
    System.out.println("The count has been reset. The count is count is now: " + getCount());
  }
}
