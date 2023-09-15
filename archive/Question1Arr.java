import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Question1Arr {
    public static void main(String[] args) {
        BufferedReader read = null;
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Welcome. This program reads in an absolute path to a locate text file containing integers and does computations on them.\nPlease enter the absolute path below eg. C:\\Users\\Thabo Jansen van Rensberg\\Desktop\\LearnJava\\src\\integers.txt");
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Absolute Path: ");
            String path = scanner.nextLine();

            read = new BufferedReader(new FileReader(path));

            String line;
            //Reading in the text file line by line
            while ((line = read.readLine()) != null) {
                int value = Integer.parseInt(line);
                arrayList.add(value);
            }

            //Finding the sum of the array
            int sum = 0;
            for (int value: arrayList) {
                sum+=value;
            }

            int minValue = Collections.min(arrayList);
            int maxValue = Collections.max(arrayList);

            Integer[] array = arrayList.toArray(new Integer[0]);
            bubbleSort(array);

            // Print the ArrayList
            System.out.println("Printing all the values in storageArr" + Arrays.toString(arrayList.toArray()));
            System.out.printf("The sum of all values in the storageArr is : %d", sum);
            System.out.println(" ");
            System.out.println();
            System.out.printf("The maximum value in the array is OptionalInt[%d]", maxValue);
            System.out.println();
            System.out.printf("The minimum value in the array is OptionalInt[%d]", minValue);
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Printing the sorted storageArr " + Arrays.toString(array));



        //Error handling
        } catch (IOException e) {
            System.out.println("File not found or error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("No strings should be in file: " + e.getMessage());
        }

        finally {
            try {
                if (read != null) {
                    read.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
    //Sorting algorithm
    static void bubbleSort(Integer[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
