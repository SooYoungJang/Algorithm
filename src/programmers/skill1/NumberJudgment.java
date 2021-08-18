package programmers.skill1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberJudgment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(3));
    }
    public static long solution(long n) {
        long answer = 0;
        for (long i = 1; i <= n; i++) {
            if (i * i == n) {
                answer = (i + 1) * (i + 1);
                break;
            } else answer = -1;
        }
        return answer;
    }
}
