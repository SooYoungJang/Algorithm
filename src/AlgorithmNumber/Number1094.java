package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1094 {
    public static void main(String[] args) throws IOException {
        //처음 64의 막대기를가지고있다.
        //N 값으로 막대기의 길이를 만들려면 몇개의 나뭇가지가 필요하는가?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int count = 0;
        int bar  = 32;
        int splitBar = 0;


        if(input == 64) {
            count = 1;
        }else {
            while (true) {
                if(input > bar + splitBar) {
                    splitBar += bar;
                    count++;
                    bar = bar / 2;
                }else if(input < bar+ splitBar) {
                    bar = bar / 2;
                }else if(input == bar + splitBar) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
