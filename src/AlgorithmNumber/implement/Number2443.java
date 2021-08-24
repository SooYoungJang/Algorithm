package AlgorithmNumber.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count =0;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n + i - 1; j++) {
                if(count <= j){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            count++;
            System.out.println("");
        }
    }
}
