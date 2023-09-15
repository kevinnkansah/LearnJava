import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of money that needs to be sorted: ");
        System.out.println("The program will breakdown total into the amount of notes in your amount.");
        System.out.println("R200 R100 R50 R20 R20 and the left over change.");
        System.out.println("Please note: The program does not account for small change, so only provide\n" +
                "rounded amounts, e.g. R 398");

        int amount = input.nextInt();
        int[] notes = { 200, 100, 50, 20, 10 };
        int[] noteCounter = new int[5];

        System.out.println(amount + " cents in coins can be given as: ");

        for (int i = 0; i < 5; i++) {

            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        for (int i = 0; i < 5; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + "  " + noteCounter[i]);
            }
        }

        System.out.printf("R %d in change", amount);
    }
}
