package TCS;

// Class to handle duplicate finding logic
class DuplicateFinder {

    // Method to find duplicates in the array
    public void findDuplicates(int[] arr) {
        System.out.print("Duplicate elements: ");
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.print("No duplicates found.");
        }
    }
}

// Main class to execute the program
public class FindDuplicates {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4, 2, 5, 3, 6};

        // Create an object of DuplicateFinder
        DuplicateFinder finder = new DuplicateFinder();

        // Call method to find duplicates in the array
        finder.findDuplicates(numbers);
    }
}
