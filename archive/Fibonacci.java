import java.util.Scanner;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 10;

        System.out.printf("What series is printed below : %d terms", n);
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            System.out.print( fibonacci(i) + ", ");
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        else {
           return fibonacci(n-2 ) + fibonacci(n-1);
        }
    }

    
}
