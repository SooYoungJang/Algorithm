package AlgorithmNumber.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //N 이 들어오면  N 의 팩토리얼 을 출력한다.
        int n = Integer.parseInt(br.readLine());
        System.out.println(rec(n));

    }

    private static int rec(int n) {
        if(n == 0 || n ==1) {
            return 1;
        }else {
            return rec(n-1) * n;
        }

    }
}
