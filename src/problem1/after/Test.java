package problem1.after;

import problem1.before.Invoice;

import java.io.IOException;

public class Test {
    public static void main(String[] args){
        InvoiceData data = new InvoiceData("ALAMI Samir");
        data.addLine("Laptop", 9000.00);
        data.addLine("Mouse", 150.00);
        data.addLine("USB cable", 50.00);

        InvoiceCalculator calculator = new InvoiceCalculator();
        InvoicePrinter printer = new InvoicePrinter(calculator);
        InvoiceRepository repository = new InvoiceRepository();

        System.out.print(printer.print(data));

        try {
            repository.save(data, printer.print(data));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
