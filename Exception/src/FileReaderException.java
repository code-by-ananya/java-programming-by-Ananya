
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the file name: ");
        String FileName = input.next();

        try (FileReader reader = new FileReader(FileName)){
            int read = 0;
            do {
                read = reader.read();
                System.out.println((char)read);
            }while (read != -1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
