public class GenerateInvoice {
  private final double price;

  public double getPrice() {
    return price;
  }

  public GenerateInvoice (double price) {
    this.price = price;
  }

  public String generateInvoice (String customerName) {
    return "Invoice for " + customerName + ": $" + price;
  }
}
