import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class term4prac2_4384756 {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();

        try {
            //var person = new Person[9];
            File textFile = new File("C:\\Users\\User\\Documents\\GitHub\\LearnJava\\src\\mainrecord.txt");
            Scanner fileReader = new Scanner(textFile);
            FileWriter staffWriter = new FileWriter("staffrecord.txt");
            FileWriter studentWriter = new FileWriter("studentrecord.txt");

            while (fileReader.hasNextLine()) {
                lines.add(fileReader.nextLine());
            }

            ArrayList<Person> people = new ArrayList<>();

            for (String line : lines) {
                String[] personData = line.split(",");
                Person person = new Person(personData[0], personData[1], personData[2], personData[3], personData[4], personData[5]);
                people.add(person);

                if (person.getPosition().equals("student")) {
                    studentWriter.write(person.toString());
                }

                else if (person.getPosition().equals("staff")) {
                    staffWriter.write(person.toString());
                
                }
            }

            studentWriter.close();
            staffWriter.close();
            fileReader.close();
        
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Enable to write file");
            e.printStackTrace();
        }
    }
}