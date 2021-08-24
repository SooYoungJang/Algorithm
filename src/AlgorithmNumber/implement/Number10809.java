package AlgorithmNumber.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String words = br.readLine();
        char[] chars = words.toCharArray();
        char[] charArr = new char[26];
        for(int i=0; i< 26; i++) {
            charArr[i] = (char) ((char) i + 97);
        }
        int[] result = new int[26];
        for (int i=0; i< charArr.length; i++) {
            if(words.indexOf(charArr[i]) != -1) {
                result[i] = words.indexOf(charArr[i]);
            }else {
                result[i] = -1;
            }
        }

        for (int a : result) {
            sb.append(a+" ");
        }
        System.out.println(sb);

    }
}