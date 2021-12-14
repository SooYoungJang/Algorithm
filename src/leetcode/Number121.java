package src.leetcode;

import java.io.IOException;

public class Number121 {
    public static void main(String[] args) throws IOException {

        maxProfit(new int[]{1,5,7,2,5});
    }

    public static int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
}
