package src.leetcode;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Number287 {
    public static void main(String[] args) throws IOException {
        findDuplicate(new int[]{1,3,4,2,2});
    }
    public static int findDuplicate(int[] nums) {
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++)  {
            map.put(nums[i], map.getOrDefault(nums[i] , 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() != 1) {
                result = entry.getKey();
            }
        }
        return result;
    }
}
