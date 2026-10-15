package problem5.after;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class CsvStudentRepository implements StudentRepository{
    private final Path path;

    public CsvStudentRepository(String filename) {
        this.path = Path.of(filename);
    }

    @Override
    public boolean exists(String cne){
        if(!Files.exists(path)){
            return false;
        }
        try{
            return Files.readAllLines(path).stream().anyMatch(line -> line.startsWith(cne + ","));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void save(String cne, String name, String email){
        String line = cne + "," + name + "," + email + System.lineSeparator();

        try {
            Files.writeString(path, line,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
