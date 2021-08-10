package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1003 {
    private static int[] countZero = null;
    private static int[] countOne = null;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for (int i=0; i < n; i ++) {
            int input = Integer.parseInt(br.readLine());
            fibonacci(input);
        }

        System.out.println(sb);

    }

   private static void fibonacci(int n) {
        countOne = new int[40];
        countZero = new int[40];
        countOne[0] = 0;
        countOne[1] = 1;
        countZero[1] = 0;
        countZero[0] = 1;
        for (int i = 2; i <= n; i ++) {
            countZero[i] = countZero[i-1] + countZero[i-2];
            countOne[i] = countZero[i-1] + countOne[i-1];
        }
        if(n == 0) {
            sb.append("1 0\n");
        }else if(n ==1) {
            sb.append("0 1\n");
        }else {
            sb.append(countZero[n] + " " +countOne[n]).append("\n");
        }

    }
}
