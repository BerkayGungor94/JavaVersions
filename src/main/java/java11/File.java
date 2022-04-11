package java11;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class File {

    @Test
    public void ReadAndWrite() throws IOException {
        Path tempFile = Files.writeString(Files.createTempFile("test",".txt"), "Gökay Berkay Güngör");
        System.out.println(tempFile);

        String fileContent = Files.readString(tempFile);
        System.out.println(fileContent);
    }
}
