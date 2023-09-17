import java.util.Scanner;

public class Question2ReverseEnginnering {

    public static void main(String[] args) {
        boolean gameOver = false; // A boolean variable to control the game loop.
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input.

        while (true) { // Outer game loop (runs until manually stopped).
            while (!gameOver) { // Inner loop for each round of the game (runs until a winner is determined).
                System.out.println("Player 1, choose P, R, or S.");
                String player1Choice = scanner.next().toLowerCase(); // Read player 1's choice and convert it to lowercase.
                System.out.println("Player 2, choose P, R, or S.");
                String player2Choice = scanner.next().toLowerCase(); // Read player 2's choice and convert it to lowercase.

                // Check the choices and determine the winner or if it's a tie.
                if (player1Choice.equals("p") && player2Choice.equals("s")) {
                    System.out.println("Scissors cuts paper, player 2 wins!");
                    gameOver = true; // Set gameOver to true to exit the inner loop.
                } else if (player1Choice.equals("s") && player2Choice.equals("p")) {
                    System.out.println("Scissors cuts paper, player 1 wins!");
                    gameOver = true;
                } else if (player1Choice.equals("p") && player2Choice.equals("r")) {
                    System.out.println("Paper covers rock, player 1 wins!");
                    gameOver = true;
                } else if (player1Choice.equals("r") && player2Choice.equals("p")) {
                    System.out.println("Paper covers rock, player 2 wins!");
                    gameOver = true;
                } else if (player1Choice.equals("r") && player2Choice.equals("s")) {
                    System.out.println("Rock breaks scissors, player 1 wins!");
                    gameOver = true;
                } else if (player1Choice.equals("s") && player2Choice.equals("r")) {
                    System.out.println("Rock breaks scissors, player 2 wins!");
                    gameOver = true;
                } else {
                    System.out.println("It is a tie! We go again.");
                }
            }

            return; // Exit the program
        }
    }
}
