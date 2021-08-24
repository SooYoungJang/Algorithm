import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(new int[]{1,2,3,4}));
    }
    private static int solution(int[] nums) {
        int answer =0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(i + 2 >= nums.length) break;
            for(int j = i + 1; j < nums.length; j++) {
                for(int h = j + 1; h < nums.length; h++) {
                    list.add(nums[i] + nums[j] + nums[h]);
                }
            }
        }

        // 저장된 합이 소수인지 판별한다.
        for(Integer i : list) {
            int count = 2;
            answer++;
            while(count < i) {
                // 저장된 값이 count로 나눴을 때 나머지가 0이라면 소수가 아니기 때문에 answer의 값을 더하지 않는다.
                if(i % count == 0) {
                    answer--;
                    break;
                }
                count++;
            }
        }
        return answer;
    }

}
