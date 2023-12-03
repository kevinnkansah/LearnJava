import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch( int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of array: ");
        int length = scanner.nextInt();

        int [] nums = new int[length];

        for (int i = 0; i < nums.length; i++ ) {
            System.out.printf("Enter the value at index position %d : ", i);
            nums[i] = scanner.nextInt();
        }

        System.out.println("Created array: " + Arrays.toString(nums));

        System.out.print("Enter the target value: ");
        int findNum = scanner.nextInt();

        int search = linearSearch(nums, findNum);

        if (search != -1) {
            System.out.printf("Element %d was found at the index %d.", findNum, search);
        } else {
            System.out.println("Element not found.");
        }
    }
}