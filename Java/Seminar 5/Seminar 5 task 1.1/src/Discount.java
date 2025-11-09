public class Discount {
  private String customerType;
  private double price;

  public String getCustomerType() {
    return customerType;
  }

  private double getPrice() {
    return price;
  }

  public Discount (String customerType, double price) {
    this.customerType = customerType;
    this.price = price;
  }

  public double getDiscountedType(String customerType) {
    if (customerType.equals("Premium")) {
      return price * 0.8;
    }
    else if (customerType.equals("Regular")) {
      return price * 0.9;
    }
    return price;
  }
}
