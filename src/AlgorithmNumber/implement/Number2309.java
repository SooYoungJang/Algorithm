package AlgorithmNumber.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number2309 {
    static int[] heights;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        heights = new int[9];
        int sum = 0;
        for (int i=0; i < 9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
            sum += heights[i];
        }
        sum -= 100;
        Arrays.sort(heights);
        boolean check =false;
        int sumHeight =0;
        for (int i =0; i<9; i++) {
            if(check) break;
            for (int j=0; j< 9; j++){
                if(i == j) continue;
               sumHeight = heights[i] + heights[j];
               if(sumHeight == sum) {
                   heights[i] = 0;
                   heights[j] = 0;
                   check = true;
                   break;
               }
            }
        }

        for (int i=0; i < 9; i++) {
            if(heights[i] != 0) {
                System.out.println(heights[i]);
            }

        }

    }

}