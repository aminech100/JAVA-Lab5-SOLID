package problem1.after;

import java.util.ArrayList;
import java.util.List;

public class InvoiceCalculator {
    public double subtotal(InvoiceData data) {
        double sum = 0;
        for (double p : data.getPrices()) sum += p;
        return sum;
    }

    public double total(InvoiceData data) {
        return subtotal(data) * 1.20; // 20% VAT
    }
}
