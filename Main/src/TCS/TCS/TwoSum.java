package TCS;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static int[] Twosum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i < nums.length;i++)
        {
            int complement = target - nums[i];

            if(map.containsKey(complement))
            {
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
    int target = 9;

    int[] result = Twosum(nums, target);

    if(result[0] != -1)
    {
        System.out.println("indices : " + result[0] + " , " + result[1]);
        System.out.println("Numbers : " + nums[result[0]] + " , " + nums[result[1]]);
    }
    else
    {
        System.out.println("No Solutions found");
    }
    }
}
