package leetcode;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Number242 {
    public static void main(String[] args) throws IOException {
        System.out.println(isAnagram("11","2"));
    }

    private static boolean isAnagram(String s, String t) {
        boolean b = true;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int sum = 0;
        for (int i=0; i< sChars.length; i++) {
            hashMap.put(sChars[i],hashMap.getOrDefault(sChars[i],0) +1);
        }
        for (int i=0; i<tChars.length; i++) {
            hashMap.put(tChars[i],hashMap.getOrDefault(tChars[i],0) -1);
            if(hashMap.get(tChars[i]) != 0) {
                return false;
            }
        }

//        for (Map.Entry<Character,Integer> entry : hashMap.entrySet()) {
//            if(entry.getValue() != 0) {
//                return false;
//            }
//        }

        return b;
    }

//    private static boolean isAnagram(String s, String t) {
//        boolean b = false;
//        if(s.length() != t.length()) {
//            System.out.println("111");
//            return false;
//        }
//        char[] sChars = s.toCharArray();
//        char[] tChars = t.toCharArray();
//
//        Arrays.sort(sChars);
//        Arrays.sort(tChars);
//        if(String.valueOf(sChars).equals(String.valueOf(tChars))) {
//            System.out.println("222");
//            b = true;
//        }else {
//            System.out.println("333");
//            b = false;
//        }
//
//        return b;
//    }


}
