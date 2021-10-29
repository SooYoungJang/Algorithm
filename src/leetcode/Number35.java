package src.leetcode;

import java.io.IOException;

public class Number35 {
    public static void main(String[] args) throws IOException {

        searchInsert(new int[]{9,9,9}, 6);
    }

    public static int searchInsert(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }

    public static int intsearchInsert(int[] nums, int target) {

        int check = 0;
        boolean b  = false;
        for(int i=0; i< nums.length; i++) {
            if(nums[i] == target) return i;
            if(nums[i] < target && !b) {
                check = i + 1;
            }else {
                return check;
            }
        }
        return check;
    }
}
