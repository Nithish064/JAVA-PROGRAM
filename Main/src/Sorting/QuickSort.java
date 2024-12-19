package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,6};

        System.out.println("Given Array :");
        System.out.println(Arrays.toString(arr));

        QuickSort(arr, 0, arr.length-1);

        System.out.println("Sorted Array : ");

        System.out.println(Arrays.toString(arr));
    }

    public static void QuickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pivot = Partition(arr, low, high);

            QuickSort(arr, low, pivot - 1);
            QuickSort(arr, pivot + 1, high);


        }
    }

    static int Partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);

        for(int j = low; j < high; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
