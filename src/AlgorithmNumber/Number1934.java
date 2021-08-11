package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1934 {
    public static void main(String[] args) throws IOException {
        //두개의 수의 최소공배수 구하기.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] st = br.readLine().split(" ");
            int input1 = Integer.parseInt(st[0]);
            int input2 = Integer.parseInt(st[1]);

            long gcd = gcd(input1,input2);
            System.out.println(gcd);
            sb.append(lcm(input1 * input2, gcd) + "\n");
        }

        System.out.println(sb);
    }

    static long gcd(long x, long y) {
        long temp;
        while (y != 0) {
            temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }

    static long lcm(long value, long gcd) {
        return value / gcd;
    }
}
