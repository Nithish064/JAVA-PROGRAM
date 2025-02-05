package TCS;
import java.util.Arrays;

// Class to handle array sorting and display
class ArraySorter {
    // Method to print the array in ascending and descending order
    public void printAscendingDescending(int[] a) {
        Arrays.sort(a); // Sort array in ascending order

        int n = a.length;
        
        // Print in ascending order
        System.out.print("Ascending Order: ");
        for (int i = 0; i < n / 2; i++) {
            System.out.print(a[i] + " ");
        }
        
        // Print in descending order
        System.out.print("\nDescending Order: ");
        for (int i = n - 1; i >= n / 2; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

// Main class to execute the program
public class AscendingDescendingarray {
    public static void main(String[] args) {
        int[] a = {6, 3, 4, 2, 5, 1};
        
        // Create an object of ArraySorter
        ArraySorter sorter = new ArraySorter();
        sorter.printAscendingDescending(a);
    }
}
