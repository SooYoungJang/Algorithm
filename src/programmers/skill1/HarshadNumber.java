package programmers.skill1;

import java.io.IOException;

public class HarshadNumber {
    public static void main(String[] args) throws IOException {

        System.out.println(solution(13));
    }

    private static boolean solution(int x) {
        boolean answer = true;
        if(x < 10) {
            return answer;
        }else {
            String[] strings = String.valueOf(x).split("");  // 18 이면  1+ 8로 변경
            int sum = 0;
            for (int i=0; i < strings.length; i++) {
                sum += Integer.parseInt(strings[i]);
            }

            if(x % sum == 0) {
                answer = true;
            }else {
                answer = false;
            }

        }

        return answer;
    }
}
