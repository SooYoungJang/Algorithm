package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number6996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i=0; i < n; i++) {
            String[] strs = br.readLine().split(" ");
            System.out.println(checkAnaGram(strs[0],strs[1]));
        }
    }

    private static String checkAnaGram(String firStr, String secStr) {

        if(firStr.length() != secStr.length()) {
            return firStr+" & "+secStr + " are NOT anagram.";
        }

        char[] firChars = firStr.toCharArray();
        char[] secChars = secStr.toCharArray();

        Arrays.sort(firChars);
        Arrays.sort(secChars);

        if(String.valueOf(firChars).equals(String.valueOf(secChars))) {
            return firStr+" & "+secStr + " are anagrams.";
        }else {
            return firStr+" & "+secStr + " are NOT anagrams.";
        }
    }
}
