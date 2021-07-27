package AlgorithmNumber;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Number1427 {
    public static void main(String[] args) throws IOException {
        //숫자 N이 주어지면 내림차순으로 정렬하기.
        //숫자를 문자열 배열로 입력받은 후, 문자열 배열을 Arrays.Stream.maptoInt.toArray를 사용하여 int배열로 변경.
        //Arrays.sort를 위해서 int 배열을 Integer배열로 변경.
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] array_word = br.readLine().split("");

        int[] nums = Arrays.stream(array_word).mapToInt(Integer::parseInt).toArray();
        Integer[] intList
                = Arrays.stream(nums)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(intList, Comparator.reverseOrder());

        for(int value: intList) {
            sb.append(value);
        }
        bw.write(sb.toString());
        bw.flush();

    }
}
