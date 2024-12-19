package Sorting;

import java.util.Arrays;

// Merge sort in Java
public class MergeSort {
  public static void main(String[] args) {
      int[] array = {64, 25, 12, 22, 11}; // Example array
      System.out.println("Original array:");
      System.out.println(Arrays.toString(array));

      mergeSort(array, 0, array.length - 1); // Perform merge sort

      System.out.println("Sorted array:");
      System.out.println(Arrays.toString(array));
  }

  // Method to perform merge sort
  public static void mergeSort(int[] array, int left, int right) {
      if (left < right) {
          // Find the middle point
          int mid = (left + right) / 2;

          // Recursively sort the first and second halves
          mergeSort(array, left, mid);
          mergeSort(array, mid + 1, right);

          // Merge the sorted halves
          merge(array, left, mid, right);
      }
  }

  // Method to merge two halves
  public static void merge(int[] array, int left, int mid, int right) {
      // Find sizes of two subarrays to be merged
      int n1 = mid - left + 1;
      int n2 = right - mid;

      // Create temporary arrays
      int[] leftArray = new int[n1];
      int[] rightArray = new int[n2];

      // Copy data to temporary arrays
      for (int i = 0; i < n1; i++) {
          leftArray[i] = array[left + i];
      }
      for (int j = 0; j < n2; j++) {
          rightArray[j] = array[mid + 1 + j];
      }

      // Merge the temporary arrays

      // Initial indexes of first and second subarrays
      int i = 0, j = 0;

      // Initial index of merged subarray
      int k = left;
      while (i < n1 && j < n2) {
          if (leftArray[i] <= rightArray[j]) {
              array[k] = leftArray[i];
              i++;
          } else {
              array[k] = rightArray[j];
              j++;
          }
          k++;
      }

      // Copy remaining elements of leftArray if any
      while (i < n1) {
          array[k] = leftArray[i];
          i++;
          k++;
      }

      // Copy remaining elements of rightArray if any
      while (j < n2) {
          array[k] = rightArray[j];
          j++;
          k++;
      }
  }
}