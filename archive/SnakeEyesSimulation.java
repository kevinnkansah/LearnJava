import java.util.Random;

public class SnakeEyesSimulation {
    public static void main(String[] args) {
        int rolls = 0; // Variable to count the number of rolls
        Random random = new Random();

        while (true) {
            int die1 = random.nextInt(6) + 1; // Roll the first die (1-6)
            int die2 = random.nextInt(6) + 1; // Roll the second die (1-6)

            rolls++; // Increment the number of rolls

            // Check if both dice show a value of 1 (snake eyes)
            if (die1 == 1 && die2 == 1) {
                System.out.println("Snake eyes after " + rolls + " rolls!");
                break; // Exit the loop
            }
        }
    }
}
