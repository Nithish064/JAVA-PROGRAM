import java.util.*;

public class SecondLargest {

    public static Integer findsecondlargest(ArrayList<Integer> nums)
    {
        if(nums == null || nums.size() < 2)
        {
            return null;
        }

        Collections.sort(nums, Collections.reverseOrder());

        return nums.get(1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);

        Integer SecondLargest = findsecondlargest(nums);

        if(SecondLargest != null)
        {
            System.out.println(SecondLargest);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
