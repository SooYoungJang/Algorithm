package programmers.skill1;

import java.io.IOException;
import java.util.Arrays;

public class budget {
    public static void main(String[] args) throws IOException {
        System.out.println(solution(new int[]{1,3,2,5,4},9));
    }
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        for(int i=0; i<d.length; i++) {
            if(sum < budget){
                sum+= d[i];
                answer++;
            }else if(sum >= budget) {
                break;
            }

            if(sum > budget) {
                answer--;
            }
        }
        System.out.println(answer);


        return answer;
    }
}
