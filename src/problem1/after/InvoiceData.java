package problem1.after;

import java.util.ArrayList;
import java.util.List;

public class InvoiceData {
    private final String customer;
    private final List<String> items = new ArrayList<>();
    private final List<Double> prices = new ArrayList<>();

    public InvoiceData(String customer) {
        this.customer = customer;
    }

    public void addLine(String item, double price) {
        items.add(item);
        prices.add(price);
    }

    public List<Double> getPrices() {
        return prices;
    }

    public List<String> getItems() {
        return items;
    }

    public String getCustomer() {
        return customer;
    }
}
