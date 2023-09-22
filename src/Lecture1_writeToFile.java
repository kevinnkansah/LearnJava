/* 
Write To a File
In the following example, we use the FileWriter class together with its write() method to write 
some text to the file we created in the example above. 
Note that when you are done writing to the file, you should close it with the close() method:
*/
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class Lecture1_writeToFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("file3.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!+extra");
      myWriter.close();
	  System.out.println("Successfully wrote to the file.");
	   
	  myWriter = new FileWriter("C:\\COS101\\file4.txt");
	  myWriter.write("Writing information to a file using the absolute path!+extra");
	  myWriter.close();
      System.out.println("Successfully wrote to the file via ABS PATH.");
	  
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}