package AlgorithmNumber.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n+i; j++) {
                if(j >= n-i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}
