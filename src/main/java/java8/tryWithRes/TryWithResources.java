package java8.tryWithRes;

import java.io.FileOutputStream;


public class TryWithResources {
    public static void main(String[] args) {

        try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\KRON\\Desktop\\Chat History kaynaklar\\Personal\\JavaVersions\\abc.txt")) {
            String msg = "Hello Berkay Hello Kron";

            byte byteArray[] = msg.getBytes();
            fileOutputStream.write(byteArray);
            System.out.println("Message written successfully");
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
