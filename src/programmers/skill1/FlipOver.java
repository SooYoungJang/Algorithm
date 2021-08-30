package programmers.skill1;

import java.io.IOException;

public class FlipOver {
    public static void main(String[] args) throws IOException {
        System.out.println(solution(16,17));

    }
        public static int solution(int left, int right) {
            int answer = 0;
            for(int i=left; i<=right; i++) {
                int count = 0;
                for(int j=1; j<=i; j++) {
                    if(i % j == 0) {
                        count++;
                    }
                }
                if(count % 2 == 0) {
                    answer = answer + i;
                }else {
                    answer = answer - i;
                }
            }


            return answer;
        }

}
