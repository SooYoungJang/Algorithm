package programmers.skill1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class IntegerDescending {
    public static void main(String[] args) throws IOException {
        long n = 793820934234L;
        solution(n);
    }
        public static long solution(long n) {
            long answer = n;
            String[] strArrays = String.valueOf(n).split("");
            Integer[] integers = new Integer[strArrays.length];

            for (int i=0; i< strArrays.length; i++) {
                integers[i] = Integer.valueOf(strArrays[i]);
            }

            Arrays.sort(integers, Collections.reverseOrder());
            String result = "";
            for (int v : integers) {
                result = result+String.valueOf(v);
            }
            answer = Long.parseLong(result);
            return answer;
        }
}
