package problem1.after;

import java.util.ArrayList;
import java.util.List;

public class InvoicePrinter {
    private final InvoiceCalculator calculator;

    public InvoicePrinter(InvoiceCalculator calculator) {
        this.calculator = calculator;
    }

    public String print(InvoiceData data) {
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice for ").append(data.getCustomer()).append("\n");
        for (int i = 0; i < data.getItems().size(); i++)
            sb.append(line(data.getItems().get(i), data.getPrices().get(i)));
        sb.append(line("Subtotal", calculator.subtotal(data)));
        sb.append(line("TOTAL", calculator.total(data)));
        return sb.toString();
    }

    private String line(String label, double value) {
        return String.format("%-12s %8.2f%n", label, value);
    }
}
