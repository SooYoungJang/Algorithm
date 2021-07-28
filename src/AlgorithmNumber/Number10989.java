package AlgorithmNumber;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Number10989 {
    public static void main(String[] args) throws IOException {
        //N개의 숫자를 받는다
        //N개 만큼의 입력을 List에 받는다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        List<String> nums = new LinkedList<>();
        for (int i =0; i<count; i++) {
            nums.add(br.readLine());
        }


        Collections.sort(nums);

        for(String i : nums) {
            bw.write(i+"\n");
            bw.flush();
        }
    }
}
