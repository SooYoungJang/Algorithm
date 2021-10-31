package src.leetcode;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Number136 {

    public static void main(String[] args) throws IOException {

        System.out.println(singleNumber(new int[]{9,9,9,2}));
    }

    public static int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i] , 0) +1);
        }
        int outPut = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                outPut = entry.getKey();
            }
        }

        return outPut;
    }
}
