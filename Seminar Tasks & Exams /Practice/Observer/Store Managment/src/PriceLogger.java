import java.util.ArrayList;
import java.util.List;

public class PriceLogger implements Observer {
    private final List<String> logs = new ArrayList<>();
    private Double lastPrice = null;

    public List<String> getLogs() {
        return logs;
    }

    @Override
    public void update(String stockSymbol, double price) {
        if (lastPrice == null) {
            lastPrice = price;
            return;
        }
        String log;
        log = "Item: " + stockSymbol + ", old price: " + lastPrice + ", new price: " + price;
        logs.add(log);
        lastPrice = price;
    }
}
