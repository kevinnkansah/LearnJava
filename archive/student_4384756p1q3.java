import java.util.Scanner;

public class student_4384756p1q3 {
    public static void main (String[] args) {
        System.out.println("Welcome to the Birthday Wizard. Given a person's year of birth, the Birthday Wizard can compute the year in which the person's nth birthday will occur or has occurred.");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);

        int birthYear; 
        int nthBirthday; 
        

        System.out.println("Enter your birth year: ");
        birthYear = scanner.nextInt();

        System.out.println("Enter your nth birthday: ");
        nthBirthday = scanner.nextInt();

        int yearOfNthBirthday = birthYear + nthBirthday;

        int lastDigit = nthBirthday % 10;

        String suffix; 

        if (lastDigit == 1) {
            suffix = "st";
        } else if (lastDigit == 2) {
            suffix = "nd";
        } else if (lastDigit == 3) {
            suffix = "rd";
        } else {
            suffix = "th";
        }

        System.out.printf("You were born in %d and your %d%s birthday was/is in %d.", birthYear, nthBirthday, suffix,  yearOfNthBirthday);
        scanner.close();
    }
}
