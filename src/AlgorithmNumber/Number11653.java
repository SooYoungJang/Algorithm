package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number11653 {
    public static  StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int input = Integer.parseInt(br.readLine());

        calcul(input);
    }

    private static void calcul(int input) {
        int count = 1;
        int value = 0;
        int in = input;
        while (true) {
            if(input == 1) {
                break;
            }else {
                count++;
                if(count > input) {
                    break;
                }
                if(in % count == 0) {
                    in = in / count ;
                    value = count;
                    count = 1;
                    System.out.println(value);
                }
            }
        }
    }
}
