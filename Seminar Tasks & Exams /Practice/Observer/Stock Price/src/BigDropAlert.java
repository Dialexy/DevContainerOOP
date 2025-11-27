public class BigDropAlert implements StockObserver {

    private Double lastPrice = null;

    @Override
    public void update(double newPrice) {
        if (lastPrice == null) {
            lastPrice = newPrice;
            return;
        }

        double change = lastPrice - newPrice;

        if (change >= 5) {
            System.out.println("Warning: Large drop in stock");
        }

        lastPrice = newPrice;
    }
}
