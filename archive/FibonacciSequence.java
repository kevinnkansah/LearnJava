import java.util.Scanner;

public class FibonacciSequence {
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        n = scanner.nextInt();
        System.out.println("Fibonacci sequence of " + n + " terms is " + fib(n));
    }
}
