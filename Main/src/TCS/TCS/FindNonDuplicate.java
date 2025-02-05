package TCS;
public class FindNonDuplicate {

    static void FindNonDuplicates(int[] arr)
    {
        boolean chk;
        for(int i = 0; i<arr.length;i++)
        {
            chk = false;
            for(int j= 0;j<arr.length;j++)
            {
                if(i!=j && arr[i] == arr[j])
                {
                    chk=true;
                    break;
                }
            }
            if(!chk)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,6,2};

        System.out.println("Non Repeating Elements : ");
        FindNonDuplicates(arr);
    }
}