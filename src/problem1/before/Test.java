package problem1.before;

import java.io.IOException;

public class Test {
    public static void main(String[] args){
        Invoice invoice = new Invoice("ALAMI Samir");
        invoice.addLine("Laptop", 9000.00);
        invoice.addLine("Mouse", 150.00);
        invoice.addLine("USB cable", 50.00);

        System.out.println(invoice.print());

        try {
            invoice.save();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
