package AlgorithmNumber.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int count =0;
        for (int i=0; i<n; i++) {
            int input = Integer.parseInt(br.readLine());
            String[] binaryStrings = Integer.toBinaryString(input).split("");

            for (int j = binaryStrings.length-1; j >= 0; j--) {
                if(binaryStrings[j].equals("1")) {
                    sb.append(count+" ");
                    count++;
                }else {
                    count++;
                }
            }
            count =0;
        }
        System.out.println(sb);
    }
}
