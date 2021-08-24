package AlgorithmNumber.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        int max = numbers[0];
        int min = numbers[0];
        if(n == 2) {
            System.out.println(numbers[0] * numbers[1]);
        }else {
            for(int i=1; i< n; i++) {
                if(max < numbers[i]) {
                    max = numbers[i];
                }
                if(min > numbers[i]) {
                    min = numbers[i];
                }
            }
            System.out.println(max*min);
        }

    }
}
