package Sorting;
import java.util.*;

public class Bubblesort {
    static void BubbleSort(int array[])
    {

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 1; j < array.length - i; j++)
            {
                if(array[j] < array[j - 1])
                {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] data = {10,20,8,4,2};

        Bubblesort.BubbleSort(data);
        System.out.println("The Sorted array : ");
        System.out.println(Arrays.toString(data));

    }
}
