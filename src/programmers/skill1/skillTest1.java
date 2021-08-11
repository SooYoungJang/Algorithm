package programmers.skill1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class skillTest1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s= br.readLine();

        char[] chars = s.toCharArray();
        char a = 'p';
        char b = 'P';
        char c = 'y';
        char d = 'Y';
        int pCount =0;
        int yCount =0;
        for (int i=0; i< chars.length; i++) {
            if(a == chars[i] || b == chars[i]) {
                pCount++;
            }else if(c == chars[i] || d == chars[i]) {
                yCount++;
            }
        }

        System.out.println(pCount+yCount);

    }
}
