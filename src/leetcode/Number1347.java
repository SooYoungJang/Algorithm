package leetcode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Number1347 {
    public static void main(String[] args) throws IOException {
//        System.out.println(minSteps("gctcxyuluxjuxnsvmomavutrrfb","qijrjrhqqjxjtprybrzpyfyqtzf"));
//        System.out.println(minSteps("leetcode","practice"));
//        System.out.println(minSteps("anagram","mangaar"));
        System.out.println(minSteps("bab","aba"));
    }

    private static int minSteps(String s, String t) {
        int count =0;
        HashMap<Character,Integer> res = new HashMap<>();
        for(char c:s.toCharArray()) {
            res.put(c,res.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> entry : res.entrySet()) {
            System.out.println(entry.getKey()  + " :: " + entry.getValue());
        }

        for(char c:t.toCharArray()) {
            if(res.containsKey(c)) {
                int k = res.get(c);
                if(k>0) count++;
                res.put(c,k-1);
            }
        }

        return s.length() - count;
    }
}
