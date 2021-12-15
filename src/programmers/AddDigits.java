package src.programmers;

import java.io.IOException;

public class AddDigits {
    public static void main(String[] args) throws IOException {
        solution(959);
    }

    public static int solution ( int n){
        int answer = 0;

        String[] intStr = String.valueOf(n).split("");
        for (int i = 0; i < intStr.length; i++) {
            int value = Integer.parseInt(intStr[i]);
            answer = answer + value;
        }

        return answer;
    }

    public static int solution1 ( int n){
        int answer = 0;

        while (n > 0) {
            int value = n % 10;
            answer = answer + value;
            n = n / 10;
        }

        return answer;
    }
}
