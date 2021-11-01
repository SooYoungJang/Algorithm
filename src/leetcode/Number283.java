package src.leetcode;

import java.io.IOException;

public class Number283 {
    public static void main(String[] args) throws IOException {
        moveZeroes(new int[]{1,2,5,9,0,2,0});
    }


    public static void moveZeroes(int[] nums) {
        if(nums.length == 0) return;

        int count =0;
        for(int i=0; i< nums.length; i++) {
            if(nums[i] != 0) nums[count++] = nums[i];
        }

        while(count < nums.length) {
            nums[count++] = 0;
        }

    }
}
