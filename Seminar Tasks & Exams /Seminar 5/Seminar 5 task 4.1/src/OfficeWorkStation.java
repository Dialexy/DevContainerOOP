import javax.swing.text.Document;

public class OfficeWorkStation implements Printable, Scannable, Faxable, Photocopy, Staple {
   @Override
  public void print(Document doc) {
    System.out.println("Printing... ");
  }

  @Override
  public void scan(Document docs) {
    System.out.println("Scanning... ");
  }

  @Override
  public void fax(Document doc) {
    System.out.println("Faxing... ");
  }

  @Override
  public void photocopy(Document docs) {
    System.out.println("Photocopying... ");
  }

  @Override
  public void staple(Document docs) {
    System.out.println("Stapling... ");
  }
}
