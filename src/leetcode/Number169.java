package src.leetcode;

import java.io.IOException;

public class Number169 {
    public static void main(String[] args) throws IOException {

        System.out.println(majorityElement(new int[]{1,2,2,3,9,9,9}));
    }
    public static int majorityElement(int[] nums) {
        int count = 1;
        int major = nums[0];

        for(int i=1; i < nums.length; i++) {
            if(count == 0) {
                count++;
                major= nums[i];
            }else if(nums[i] == major) {
                count++;
            }else {
                count--;
            }
        }
        return major;
    }
}
