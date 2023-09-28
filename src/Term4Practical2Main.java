import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class Term4Practical2Main {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();

        try {
            //var person = new Person[9];
            File textFile = new File("C:\\Users\\User\\Documents\\GitHub\\LearnJava\\src\\mainrecord.txt");
            Scanner fileReader = new Scanner(textFile);

            while (fileReader.hasNextLine()) {
                lines.add(fileReader.nextLine());
            }

            ArrayList<Person> people = new ArrayList<>();

            for (String line : lines) {
                String[] personData = line.split(",");
                Person person = new Person(personData[0], personData[1], personData[2], personData[3], personData[4], personData[5]);
                people.add(person);
            }
            var andre = people.get(0);
            System.out.println(andre.toString());

            fileReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
