package leetcode;

import java.io.IOException;

public class Number66 {
    public static void main(String[] args) throws IOException {

        plusOne(new int[]{9,9,9});
    }

    public static int[] plusOne(int[] digits) {

        int size = digits.length;
        for(int i= size -1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }else {
                digits[i] = 0;
            }
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
