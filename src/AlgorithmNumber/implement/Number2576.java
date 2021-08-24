package AlgorithmNumber.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Number2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrays = new ArrayList<>();
        int sum = 0;
        int result = 0;
        for(int i=0; i < 7; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input % 2 != 0) {
                sum += input;
                arrays.add(input);
            }
        }

        if(sum == 0) {
            System.out.println("-1");
        }else {
            Collections.sort(arrays);
            result = arrays.get(0);
            System.out.println(sum);
            System.out.println(result);
        }
    }
}
