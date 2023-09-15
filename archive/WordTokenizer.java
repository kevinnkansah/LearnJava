import java.util.Scanner;

public class WordTokenizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String inputLine = scanner.nextLine();

        // Split the input line into words using regular expressions
        String[] words = inputLine.split("[^a-zA-Z']+");

        for (String word : words) {
            // Check if the word is not empty and contains at least one letter
            if (!word.isEmpty() && containsLetter(word)) {
                System.out.println(word);
            }
        }

        scanner.close();
    }

    // Check if a word contains at least one letter
    private static boolean containsLetter(String word) {
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                return true;
            }
        }
        return false;
    }
}
