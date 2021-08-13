package leetcode;

import java.io.IOException;
import java.util.Arrays;

public class Number242 {
    public static void main(String[] args) throws IOException {
        System.out.println(isAnagram("anagram","nagaram"));
    }

    private static boolean isAnagram(String s, String t) {
        boolean b = false;
        if(s.length() != t.length()) {
            System.out.println("111");
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);
        if(String.valueOf(sChars).equals(String.valueOf(tChars))) {
            System.out.println("222");
            b = true;
        }else {
            System.out.println("333");
            b = false;
        }

        return b;
    }
}
