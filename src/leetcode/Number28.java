package src.leetcode;

import java.io.IOException;

public class Number28 {
    public static void main(String[] args) throws IOException {
        strStr("hello","ll");
    }

    public static int strStr(String haystack, String needle) {

        int a = 0;
        if(haystack.equals("") && needle.equals("")) return 0;
        if(haystack.contains(needle)) {
            a = haystack.indexOf(needle);
        }else {
            a = -1;
        }
        return a;
    }
}
