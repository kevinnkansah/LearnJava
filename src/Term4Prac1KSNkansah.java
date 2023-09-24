import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Term4Prac1KSNkansah {

    public static void main(String[] args) {
        String[] filenames = {
                "cipher1.txt",
                "cipher2.txt",
                "cipher3.txt",
                "cipher4.txt",
                "cipher5.txt",
                "cipher6.txt",
                "cipher7.txt"};

        List<Character> middleLetters = new ArrayList<>();

        for (String filename : filenames) {
            try {
                //This is the only way i could read in the file
                File textFile = new File(String.format("C:\\Users\\User\\Documents\\GitHub\\LearnJava\\src\\%s", filename));
                Scanner fileReader = new Scanner(textFile);

                List<Character> letters = new ArrayList<>();
                while (fileReader.hasNextLine()) {
                    String line = fileReader.nextLine();
                    for (int i = 0; i < line.length(); i++) {
                        letters.add(line.charAt(i));
                    }
                }

                int middleIndex = letters.size() / 2;
                middleLetters.add(letters.get(middleIndex));

                fileReader.close();

            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

        String name = "";

        for (Character letter : middleLetters) {
            name += letter;
        }

        String reversedName = name;
        String actorName = "";
        for (int i = reversedName.length() - 1; i >= 0; i--) {
            actorName += reversedName.charAt(i);
        }

        System.out.println("The name of the famous TV character is: " + actorName);






    }
}
