/*
Read a File
In the previous chapter, you learned how to create and write to a file.
In the following example, we use the Scanner class to read the contents of the text file 
*/
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Lecture1_readFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("C:\\Users\\User\\Documents\\GitHub\\LearnJava\\src\\cipher1.txt");
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