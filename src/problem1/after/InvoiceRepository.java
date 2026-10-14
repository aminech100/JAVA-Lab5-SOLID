package problem1.after;

import java.io.FileWriter;
import java.io.IOException;

public class InvoiceRepository {
    public void save(InvoiceData data, String content) throws IOException {
        try (FileWriter fw = new FileWriter(data.getCustomer() + "(after).txt")) {
            fw.write(content);
        }
    }
}
