import java.util.Scanner;

public class cos101t3home1 {

    public static void main(String[] var0) {
        boolean var3 = false; // A boolean variable to control the game loop.
        Scanner var4 = new Scanner(System.in); // Create a Scanner object for user input.

        while (true) { // Outer game loop (runs indefinitely until manually stopped).
            while (!var3) { // Inner loop for each round of the game (runs until a winner is determined).
                System.out.println("Player 1, choose P, R, or S.");
                String var1 = var4.next().toLowerCase(); // Read player 1's choice and convert it to lowercase.
                System.out.println("Player 2, choose P, R, or S.");
                String var2 = var4.next().toLowerCase(); // Read player 2's choice and convert it to lowercase.

                // Check the choices and determine the winner or if it's a tie.
                if (var1.equals("p") && var2.equals("s")) {
                    System.out.println("Scissors cuts paper, player 2 wins!");
                    var3 = true; // Set var3 to true to exit the inner loop.
                } else if (var1.equals("s") && var2.equals("p")) {
                    System.out.println("Scissors cuts paper, player 1 wins!");
                    var3 = true;
                } else if (var1.equals("p") && var2.equals("r")) {
                    System.out.println("Paper covers rock, player 1 wins!");
                    var3 = true;
                } else if (var1.equals("r") && var2.equals("p")) {
                    System.out.println("Paper covers rock, player 2 wins!");
                    var3 = true;
                } else if (var1.equals("r") && var2.equals("s")) {
                    System.out.println("Rock breaks scissors, player 1 wins!");
                    var3 = true;
                } else if (var1.equals("s") && var2.equals("r")) {
                    System.out.println("Rock breaks scissors, player 2 wins!");
                    var3 = true;
                } else {
                    System.out.println("It is a tie! We go again.");
                }
            }

            return; // Exit the program (outer loop will run indefinitely).
        }
    }
}
