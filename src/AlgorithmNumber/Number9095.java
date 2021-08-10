package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number9095 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        if(n > 3) {
            result = search(n);
        }else if(n == 1) {
            result = 1;
        }else if(n == 2) {
            result = 2;
        }else if (n == 3) {
            result = 4;
        }
        System.out.println(result);

    }
    private static int search(int n) {
        int[] dp  = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;
            for (int i=3; i < n; i++) {
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }


        return dp[n-1];
    }
}
