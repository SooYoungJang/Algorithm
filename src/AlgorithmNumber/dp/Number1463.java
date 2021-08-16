package AlgorithmNumber.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1463 {
    private static int result = 0;
    private static int input = 0;
    public static void main(String[] args) throws IOException {
        //X가 3으로 나누어 떨어지면, 3으로 나눈다.
        //X가 2로 나누어 떨어지면, 2로 나눈다.
        //1을 뺀다.
        // n = 2 . result = 1 , n = 10 . result = 3  10의 경우에 10 -> 9 -> 3 -> 1 로 3번 만에 만들 수 있다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fib(n));
    }
    private static int fib(int n) {
        if(n ==0) {
            return result;
        }else if(n == 1){
            return 0;
        }else if (n == 2) {
            return 1;
        }else {
            if(n % 3 == 0 || n % 3 == 1) {
                if(n % 3 ==0) {
                    result++;
                    input = n / 3;
                    fib(input);
                } else {
                    result = result + 2;
                    input = (n-1) / 3;
                    fib(input);
                }
            }else if (n % 2 == 0 || n % 2 == 1) {
                if(n % 2 ==0) {
                    result++;
                    input = n / 2;
                    fib(input);
                }else {
                    result = result+2;
                    input = (n-1) / 2;
                    fib(input);
                }
            }
        }

        return result;
    }
}
