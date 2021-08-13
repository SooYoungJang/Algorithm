package leetcode;

import java.io.IOException;
import java.util.*;

public class Number49 {
    public static void main(String[] args) throws IOException {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs);
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        List<String> keyList = new ArrayList<>();
        List<String> list = new ArrayList<>();
        List<List<String>> valueList = new ArrayList<>();
        HashMap<String,List> hashMap = new HashMap<>();

        char[] c = null;
        for (int i =0; i < strs.length; i++) {
             c = strs[i].toCharArray();
             Arrays.sort(c);
            String key = String.valueOf(c);
            keyList.add(key);

            if(!hashMap.containsKey(key)){
                hashMap.put(key,new ArrayList());
            }
            hashMap.get(key).add(strs[i]);
        }
        for (Map.Entry<String,List> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " :: " + entry.getValue());
        }

        return new ArrayList(hashMap.values());
    }
}
