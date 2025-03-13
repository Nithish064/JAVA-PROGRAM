package TCS;
import java.util.Scanner;

public class Main {

    // Function to remove duplicates from the sorted array
    public static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1; // Return the number of unique elements
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3};  // Input array

        // Call removeDuplicates function
        int k = removeDuplicates(arr);

        // Display the array after removing duplicates
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}