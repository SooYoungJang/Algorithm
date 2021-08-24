package AlgorithmNumber.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[9];
        for(int i=0; i< numbers.length; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        int max = numbers[0];
        int order = 0;
        for(int i=0; i<numbers.length; i++) {
            if(i == 1) {
                order = 1;
            }
            if(max < numbers[i]) {
                order = i+1;
                max = numbers[i];
            }

        }
        System.out.println(max);
        System.out.println(order);
    }
}
