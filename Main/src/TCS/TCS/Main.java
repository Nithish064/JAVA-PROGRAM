package TCS;
import java.util.*;

class ArrayManipulator {
    // Method to remove duplicates from the sorted array
    public int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1; // Return the number of unique elements
    }
}

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3};  // Input array

        // Create an instance of ArrayManipulator
        ArrayManipulator manipulator = new ArrayManipulator();

        // Call removeDuplicates method
        int k = manipulator.removeDuplicates(arr);

        // Display the array after removing duplicates
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
