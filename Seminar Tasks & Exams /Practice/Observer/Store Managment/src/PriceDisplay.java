public class PriceDisplay implements Observer {

    @Override
    public void update(String stockSymbol, double price) {
        System.out.printf("Item: %s, new price: %f%n", stockSymbol, price);
     }
}
