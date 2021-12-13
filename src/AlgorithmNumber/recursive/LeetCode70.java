package src.AlgorithmNumber.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeetCode70 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        int result = 0;
        int dp[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if(i == 1) {
                dp[i] = 1;
            }else if (i == 2) {
                dp[i] = 2;
            }else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        result = dp[n];
        return result;
    }

}
