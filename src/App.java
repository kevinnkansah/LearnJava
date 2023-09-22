import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        // Array of file names to search for the character's name
        String[] fileNames = {
                "cipher1.txt",
                "cipher2.txt",
                "cipher3.txt",
                "cipher4.txt",
                "cipher5.txt",
                "cipher6.txt",
                "cipher7.txt"
        };

        // Initialize an empty string to store concatenated first least occurring letters
        String concatenatedLetters = "";

        // Iterate through each file in the array
        for (String fileName : fileNames) {
            // Find the first least occurring letter in the current file
            char firstLeastOccurringLetter = findFirstLeastOccurringLetter(fileName);
            
            // Concatenate the letter to the result string
            concatenatedLetters += firstLeastOccurringLetter;
        }

        // Print the concatenated first least occurring letters
        System.out.println("Concatenated first least occurring letters: " + concatenatedLetters);
    }

    // Method to find the first least occurring letter in a file
    private static char findFirstLeastOccurringLetter(String fileName) {
        // Initialize the least occurring letter with a space
        char leastOccurringLetter = ' ';
        
        // Create an array to store counts for each letter (assuming lowercase English letters)
        int[] letterCounts = new int[26];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean foundFirstLetter = false;

            // Read each line from the file
            while ((line = reader.readLine()) != null && !foundFirstLetter) {
                // Count the occurrences of each letter in the line
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        c = Character.toLowerCase(c);
                        letterCounts[c - 'a']++; // Increment the count for the corresponding letter
                    }
                }

                // Find the first least occurring letter
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        c = Character.toLowerCase(c);
                        if (letterCounts[c - 'a'] == 1) {
                            leastOccurringLetter = c;
                            foundFirstLetter = true;
                            break;
                        }
                    }
                }
            }
        } catch (IOException e) {
            // Handle file-related errors
            System.err.println("An error occurred while reading the file: " + fileName);
            e.printStackTrace();
        }

        return leastOccurringLetter;
    }
}
