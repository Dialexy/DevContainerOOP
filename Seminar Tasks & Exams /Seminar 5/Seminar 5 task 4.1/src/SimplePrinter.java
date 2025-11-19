import javax.swing.text.Document;

public class SimplePrinter implements Printable {
  @Override
  public void print(Document doc) {
    System.out.println("Printing... ");
  }
}
