package TCS;
public class Secondlargest {
    public static void main(String[] args) 
    {
        int arr[] = {100,20,40,60,120,400};
        int Secondlargest = 0;
        int largest = 0;
        System.out.println("The given array is : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + "\t");
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                Secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > Secondlargest)
            {
                Secondlargest = arr[i];
            }
        }

        System.out.println("The secondLargest number in the given array : " + Secondlargest);
        System.out.println("The largest number in the given array : " + largest);
    }
}
