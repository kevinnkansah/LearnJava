import java.util.*;

public class FirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello out there.");
        System.out.println("I will add two numbers for you.");
        System.out.println("Enter two whole numbers on a line:");
        int n1;
        Scanner keyboard = new Scanner(System.in);
        n1 = keyboard.nextInt();
        int n2;
        n2 = keyboard.nextInt();
        System.out.println("The sum of those two numbers is " + (n1 + n2));
        keyboard.close();
    }
}
