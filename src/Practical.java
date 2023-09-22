import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practical {
    public static void main(String[] args) {
        String[] filenames = {"cipher1.txt", "cipher2.txt", "cipher3.txt", "cipher4.txt", "cipher5.txt", "cipher6.txt", "cipher7.txt"};
        for (String filename : filenames) {
            try {
                File myObj = new File(String.format("C:\\Users\\User\\Documents\\GitHub\\LearnJava\\src\\%s", filename));
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
