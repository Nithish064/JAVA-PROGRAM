package Sorting;
import java.util.*;

public class SelectionSort {
    void Selectionsort(int array[])
    {
        int size = array.length;

        for(int i = 0; i < size - 1; i++)
        {
            int min_idx = i;

            for(int j = i+1; j < size; j++)
            {
                if(array[j] < array[min_idx])
                {
                    min_idx = j;
                }

                int temp = array[i];
                array[i] = array[min_idx];
                array[min_idx] = temp;
            }
        }
    }

    public static void main(String args[])
    {
        int[] data = {12,3,6,30,2};

        SelectionSort ss = new SelectionSort();
        ss.Selectionsort(data);
        System.out.println(Arrays.toString(data));
    }
}
