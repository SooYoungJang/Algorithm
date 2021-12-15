package src.programmers;

import java.io.IOException;
import java.util.Arrays;

public class PermutationCheck {
    public static void main(String[] args) throws IOException {
        solution(new int[]{1,2,3,4});
    }


    public static boolean solution(int[] arr) {
        boolean answer = true;

        int size = arr.length;
        Arrays.sort(arr);
        int checkValue = Integer.MIN_VALUE;
        for(int i = 0; i < size; i++) {
            if(checkValue == arr[i]) return false;
            checkValue = arr[i];
            if(arr[i] > size || arr[i] == 0) return false;

        }

        return answer;
    }
}
