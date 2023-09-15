import java.util.Arrays;

public class MergeSortedList {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};

        int[] merged = mergeArrays(arr1, arr2);

        System.out.println("Merged array: " + Arrays.toString(merged));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] merged = new int[length1 + length2];

        int i = 0, j = 0, k = 0;

        while (i < length1 && j < length2) {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < length1) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        while (j < length2) {
            merged[k] = arr2[j];
            j++;
            k++;
        }
        return merged;
    }
}
