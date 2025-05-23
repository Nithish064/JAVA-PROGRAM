package TCS;

// Class to handle the Binary Search
class BinarySearcher {

    // Method to perform binary search and return index of target
    public int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];  // Check if the array is sorted in ascending order

        while(start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;  // Return the index if target is found
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;  // Return -1 if target is not found
    }
}

// Main class to execute the program
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = -4;

        // Create an object of BinarySearcher
        BinarySearcher searcher = new BinarySearcher();
        int ans = searcher.binarySearch(arr, target);  // Call binarySearch method

        if(ans == -1)
        {
            System.out.println("Element not found");
        }
        else{
            System.out.println(ans);
        }  // Output the result
    }
}
