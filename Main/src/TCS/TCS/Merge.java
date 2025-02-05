// Class to merge two arrays
package TCS;

import java.util.Arrays;

class ArrayMerger {
    // Method to merge two arrays using a normal for loop
    public int[] mergeArrays(int[] a, int[] b) {
        int l1 = a.length;
        int l2 = b.length;
        int[] m = new int[l1 + l2];

        // Copy elements from first array
        for (int i = 0; i < l1; i++) {
            m[i] = a[i];
        }

        // Copy elements from second array
        for (int i = 0; i < l2; i++) {
            m[l1 + i] = b[i];
        }

        return m;
    }
}

// Main class to test the functionality
public class Merge {
    public static void main(String[] args) {
        // Creating an instance of ArrayMerger
        ArrayMerger merger = new ArrayMerger();

        // Define two arrays
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};


        int[] m = merger.mergeArrays(a, b);

        // Print merged array
        System.out.print("Merged Array: ");
        System.out.println(Arrays.toString(m));
    }
}
