package AlgorithmNumber.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i< n; i++) {
            for (int j=1; j<= n + i; j++) {
                if(n-i <= j) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        int count =2;
        for (int i = 0; i < n -1; i++) {
            for (int j = 1; j <= (n * 2) - count; j++) {
                if(j < count) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            count++;
            System.out.println("");
        }

    }
}
