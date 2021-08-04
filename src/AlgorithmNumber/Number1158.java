package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;


public class Number1158 {
    public static void main(String[] args) throws IOException {
        //요세푸스 순열.
        // N은 =3 K =7 일경우
        // 1, 2, 3, 4, 5, 6, 7 이 있다.
        // 정답출력은 <3, 6, 2, 7, 5, 1, 4> 이렇게되어야한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int count = 1;

        sb.append("<");

        for (int i =1; i <= n; i ++) {
            queue.addLast(i);
        }

        while (!queue.isEmpty()) {
            if(count == k) {
                sb.append(queue.getFirst()+", ");
                queue.remove(queue.removeFirst());
                count = 1;
            }else {
                queue.addLast(queue.removeFirst());
                count++;
            }
        }
        sb.replace(sb.lastIndexOf(","),sb.length(),"");

        sb.append(">");

        System.out.println(sb);

    }
}