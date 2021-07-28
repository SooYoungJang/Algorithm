import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //방법 1.
        // Collection.sort 사용
        // N개의 숫자를 받는다
        // N개 만큼의 입력을 List에 받는다
        // Collections. sort 를 사용하여 출력하였더니 메모리 초과가 생겻다.
        // 이문제에 메모리제한은 3mb이다.

        //방법1
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int count = Integer.parseInt(br.readLine());
//        List<String> nums = new LinkedList<>();
//        for (int i =0; i<count; i++) {
//            nums.add(br.readLine());
//        }

//        Collections.sort(nums);
//
//        for(String i : nums) {
//            bw.write(i+"\n");
//            bw.flush();
//        }

        //방법2
        //Countingsort 알고리즘 사용.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[10001]; //       수의 범위 (0 ~ 10000) 사실상 0은 제외
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            // 해당 인덱스의 값을 1 증가
            cnt[Integer.parseInt(br.readLine())] ++;
        }
        // 0은 입력범위에서 없으므로 1부터 시작
        for(int i = 1; i < 10001; i++){
            // i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
            while(cnt[i] > 0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);

    }
}
