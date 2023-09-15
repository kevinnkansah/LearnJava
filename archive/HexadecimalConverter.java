import java.util.Scanner;

public class HexadecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hexadecimal string: ");
        String input = scanner.nextLine();

        if (isValidHexadecimal(input)) {
            int decimalValue = convertHexToDecimal(input);
            System.out.println("Base-10 value: " + decimalValue);
        } else {
            System.out.println("Error: Not a valid hexadecimal string.");
        }

        scanner.close();
    }

    // Function to check if a string contains valid hexadecimal digits
    public static boolean isValidHexadecimal(String str) {
        for (char ch : str.toCharArray()) {
            if (!isHexDigit(ch)) {
                return false; // Found a character that is not a hexadecimal digit
            }
        }
        return true; // All characters are valid hexadecimal digits
    }

    // Function to find the hexadecimal value of a character
    public static int hexValue(char ch) {
        switch (Character.toUpperCase(ch)) {
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            case 'A': return 10;
            case 'B': return 11;
            case 'C': return 12;
            case 'D': return 13;
            case 'E': return 14;
            case 'F': return 15;
            default: return -1; // Not a valid hexadecimal digit
        }
    }

    // Function to convert a hexadecimal string to a decimal integer
    public static int convertHexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            decimalValue = decimalValue * 16 + hexValue(hex.charAt(i));
        }
        return decimalValue;
    }

    // Function to check if a character is a hexadecimal digit
    public static boolean isHexDigit(char ch) {
        return Character.isDigit(ch) || (Character.toUpperCase(ch) >= 'A' && Character.toUpperCase(ch) <= 'F');
    }
}
