package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1476 {
    public static void main(String[] args) throws IOException {
        //a 는 16이 되면 다시 1로 초기화.
        //b는 29가 되면 다시 1초 초기화
        //c는 20이되면 다시 1로 초기화.
        // 1 2 3 일경우 정답은 5266
        // 15 28 19 일경우 정답은 7980
        // 1 16 16 일 경우 정답은 16
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] values = br.readLine().split(" ");
        int a = Integer.parseInt(values[0]);
        int b = Integer.parseInt(values[1]);
        int c = Integer.parseInt(values[2]);
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int count = 0;

        while (countA != a || countB != b || countC != c) {
            countA++; countB++; countC++;
            System.out.println(countA + " a = " + a );
            System.out.println(countB + " b = " + b );
            System.out.println(countC + " c = " + c );
            if(countA == 16) {
                countA = 1;
            }
            if(countB == 29) {
                countB = 1;
            }
            if(countC == 20) {
                countC = 1;
            }

            count++;
        }
        System.out.println(count);
    }
}
