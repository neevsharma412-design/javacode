import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {

        try {

            FileWriter fw = new FileWriter("test.txt");

            fw.write("Welcome to Java File Handling");

            fw.close();

            System.out.println("File Created Successfully");

        } catch(IOException e) {

            System.out.println("Error Occurred");
        }
    }
}