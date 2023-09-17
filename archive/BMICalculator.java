import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the BMI calculator.");

        double h;
        double w;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your height in meters: ");
        h = Double.parseDouble(scanner.next());


        System.out.print("Enter your weight in kg: ");
        w = Double.parseDouble(scanner.next());

        if (bmi(h, w) <= 18.5) {
            System.out.println("Underweight");
        } else if (bmi(h, w) < 18.5 && bmi(h, w) < 24.9) {
            System.out.println("Normal");
        } else if (bmi(h,w) < 25 && bmi(h,w) < 29.29) {
            System.out.println("Overweight");
        } else {
            System.out.println("Fat as f*ck");
        }
        System.out.println("Your BMI is: "+ bmi(h, w));

        System.out.println("Press any key to exit");


    }
    public static double bmi(double height, double weight) {
        return weight / (height * height);
    }
}
