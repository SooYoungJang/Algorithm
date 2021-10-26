package src.leetcode;

import java.io.IOException;

public class Number258 {
    public static void main(String[] args) throws IOException {
        System.out.println(badAddDigits(5252));
    }

    //내가 푼 로직. 공간복잡도 시간복잡도가 bad 하다.
    public static int badAddDigits(int num) {
        if(num == 0) return 0;

        int result = num;
        while(result >= 10) {
            int value = 0;
            String[] strs = String.valueOf(result).split("");
            for(int i=0; i< strs.length; i++) {
                value += Integer.valueOf(strs[i]);
            }
            result = value;
        }
        return result;
    }

    //좋은 솔루션.. 공간복잡도 시간복잡도가 나이스 하다.
    public static int bestAddDigits(int num) {
        if (num == 0){
            return 0;
        }
        if (num % 9 == 0){
            return 9;
        }
        else {
            return num % 9;
        }
    }
}
