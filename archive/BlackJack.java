// Kevin Sesu Nkansah
//4384756

import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 21:");

        int user;
        try {
            user = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number between 1 and 21.");
            return;
        } finally {
            scanner.close();
        }

        if (user < 1 || user > 21) {
            System.out.println("Invalid input. Please enter a number between 1 and 21.");
            return;
        }


        int dealerNumber = generateRandomNumber();
        int userTotal = user + generateRandomNumber();

        System.out.println("User number: " + userTotal);
        System.out.println("Dealer number: " + dealerNumber);

        if (userTotal > 21 || (dealerNumber <= 21 && dealerNumber >= userTotal)) {
            System.out.println("Dealer wins!");
        }
        else if (userTotal == dealerNumber) {
            System.out.println("Tie!");
        }
        else {
            System.out.println("User wins!");
        }
    }
    private static int generateRandomNumber() {
        return (int) (Math.random() * 20 + 1);
    }
}
