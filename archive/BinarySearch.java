import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of array: ");
        int length = scanner.nextInt();

        int [] array = new int[length];

        for (int i = 0; i < array.length; i++ ) {
            System.out.printf("Enter the value at index position %d : ", i);
            array[i] = scanner.nextInt();
        }

        System.out.println("Created array: " + Arrays.toString(array));

        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();


        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.printf("Element %d found at index : %d",target, index );
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
