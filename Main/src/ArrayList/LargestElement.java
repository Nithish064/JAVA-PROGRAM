import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(4);
        nums.add(5);
        nums.add(7);
        nums.add(8);
        nums.add(10);

        int max = nums.get(0);

        for(int i = 0;i<nums.size();i++)
        {
            if(max<nums.get(i))
            {
                max = nums.get(i);
            }
        }
        System.out.println(max);

    }
}
