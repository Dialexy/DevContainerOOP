import javax.swing.text.Document;

public class MultiFunctionPrinter implements Printable, Scannable, Photocopy {
  @Override
  public void print(Document doc) {
    System.out.println("Printing... ");
  }

  @Override
  public void scan(Document docs) {
    System.out.println("Scanning... ");
  }

  @Override
  public void photocopy(Document docs) {
    System.out.println("Photocopying... ");
  }
}
