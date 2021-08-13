package programmers.skill1;

import java.io.IOException;

public class NumberAvg {
    public static void main(String[] args) throws IOException {
        System.out.println(solution(new int[]{1,2,3,4}));
    }

    private static double solution(int[] arr) {
        double answer = 0;
        int mock = arr.length;
        double sum =0;

        for (int i=0; i < mock; i++) {
            sum += arr[i];
        }
        answer = sum / mock;

        return answer;
    }
}
