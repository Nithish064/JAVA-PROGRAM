package TCS;

import java.util.Scanner;

public class LinearSearch {

    // Function to perform linear search
    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if element is found
            }
        }
        return -1; // Return -1 if element not found
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 23, 6, 8, 5, 3};
        int target = 6;

        // Call the linearSearch function
        int ans = linearSearch(arr, target);

        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at the index of " + ans);
        }
    }
}
