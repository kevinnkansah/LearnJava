// Java Program to Write Into a File
// using writeString() Method

// Importing required classes
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Main class
public class Lecture1_writeAnotherFile {

	// Main driver method
	public static void main(String[] args)
		throws IOException
	{
		// Assigning the content of the file
		String text
			= "To Write To A File Ot Not to Write to A File";

		// Defining the file name of the file
		Path fileName = Path.of(
			"C:/COS101/patFile.txt");

		// Writing into the file
		Files.writeString(fileName, text);

		// Reading the content of the file
		String file_content = Files.readString(fileName);

		// Printing the content inside the file
		System.out.println(file_content);
	}
}