package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Number1978 {
    public static void main(String[] args) throws IOException {
        //N 개의 갯수와 수가 주어지면 소수를 찾는다.
        // 소수란 : 1과 자기자신을 제외한 나머지 약수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] inputStrArray = br.readLine().split(" ");
        int[] inputIntArray = Stream.of(inputStrArray).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        for (int i=0; i < n; i++) {
//            System.out.println(calcul(inputIntArray[i]));
            count += calcul(inputIntArray[i]);
        }

        System.out.println(count);

    }
    private static int calcul(int inputNumber) {
        int count =0;
        for (int i = 1; i < inputNumber; i++) {
            if (inputNumber == 1 ) {
                count = 0;
            }else if(inputNumber % i == 0) {
                count = 1;
            }
        }
        return count;
    }
}

