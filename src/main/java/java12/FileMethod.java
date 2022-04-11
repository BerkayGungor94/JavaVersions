package java12;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMethod {

    @Test
    public void MismatchMethod() throws IOException {
        Path filePath1 = Files.createTempFile("Berkay", ".txt");
        Path filePath2 = Files.createTempFile("Gungor", ".txt");

        Files.writeString(filePath1,"Berkay Güngör");
        Files.writeString(filePath2,"Berkay Güngör Kron");

        long mismatch = Files.mismatch(filePath1, filePath2);

        if (mismatch == -1) {
            System.out.println("Same Content");
        } else {
            System.out.println("Different Content");
        }
        System.out.println(mismatch);

        filePath1.toFile().deleteOnExit();
        filePath2.toFile().deleteOnExit();
    }
}
