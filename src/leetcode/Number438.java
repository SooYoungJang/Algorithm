package leetcode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Number438 {
    public static void main(String[] args) throws IOException {
        findAnagrams("cbaebabacd","abc");
    }
    private static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        // for a valid anagram, all array values need to be 0
        // go through characters in p and decrement their count
        int[] count = new int[128];
        for(char chr : p.toCharArray())
            count[chr]--;

        // count < 0, we need to find this character
        // count == 0, we have enough of this character
        // count > 0, we have too much of this character

        // expand window by going through characters in s, whilst incrementing their count
        // when its count > 0, then we have too much of it
        // to solve this shrink the window by moving start forward and decrementing the count of that character
        // loop will stop when we remove enough of that character to make the count == 0

        // the window will be the desired length only if, it contains the required characters we needed to find

        for(int end = 0, start = 0; end < s.length(); end++){
            if(++count[s.charAt(end)] > 0)
                while(--count[s.charAt(start++)] != 0){}

            if(end - start + 1 == p.length())
                list.add(start);
        }
        for (int a : list) {
            System.out.println(a);
        }

        return list;
    }
}
