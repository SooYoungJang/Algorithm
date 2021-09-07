package programmers.skill2;

import java.io.IOException;
import java.util.Arrays;

public class KNumbers {

        public static void main(String[] args) throws IOException {

            System.out.println(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2,5,3},{4,4,1},{1,7,3}}));
        }
        public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) {
            int[] tempArr = new int[commands[i][1] - commands[i][0] + 1];
            int cnt = 0;
            for(int j=commands[i][0] -1; j < commands[i][1]; j++) {
                    tempArr[cnt++] = array[j];
            }
            Arrays.sort(tempArr);
            answer[i] = tempArr[commands[i][2]-1];
        }

        return answer;
    }
}
