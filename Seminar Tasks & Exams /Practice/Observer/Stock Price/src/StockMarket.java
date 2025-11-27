import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private double price;
    private List<StockObserver> members = new ArrayList<>();

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
        notifyObservers();
    }

    public void subscribe(StockObserver member) {
       members.add(member);
    }

    public void unsubscribe(StockObserver member) {
        members.remove(member);
    }

    private void notifyObservers() {
        for (StockObserver subjects : members) {
            subjects.update(price);
        }
    }
}
