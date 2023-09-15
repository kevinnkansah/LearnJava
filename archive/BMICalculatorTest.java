import java.util.Scanner;

public class BMICalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);

        System.out.println("Your BMI is: " + bmi);
        System.out.println("Interpretation: " + interpretBMI(bmi));

        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Weight and height must be positive values.");
        }

        return weight / (height * height);
    }

    public static String interpretBMI(double bmi) {
        if (bmi < 16) {
            return "Severely underweight";
        } else if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else if (bmi < 35) {
            return "Obese Class I (Moderately obese)";
        } else if (bmi < 40) {
            return "Obese Class II (Severely obese)";
        } else {
            return "Obese Class III (Very severely obese)";
        }
    }
}
