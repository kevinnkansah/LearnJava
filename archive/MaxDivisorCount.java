public class MaxDivisorCount {
    public static void main(String[] args) {
        int maxDivisorCount = 0; // Variable to track the maximum divisor count
        int numberWithMaxDivisors = 0; // Variable to track the number with the most divisors

        for (int i = 1; i <= 10000; i++) {
            int divisorCount = countDivisors(i);

            if (divisorCount > maxDivisorCount) {
                maxDivisorCount = divisorCount;
                numberWithMaxDivisors = i;
            }
        }

        System.out.println("The integer with the largest number of divisors is: " + numberWithMaxDivisors);
        System.out.println("It has " + maxDivisorCount + " divisors.");
    }

    // Function to count divisors of a given number
    public static int countDivisors(int number) {
        int divisorCount = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisorCount++;
            }
        }

        return divisorCount;
    }
}
