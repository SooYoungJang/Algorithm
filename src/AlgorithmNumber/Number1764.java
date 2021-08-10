package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Number1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList<>();
        String[] words = br.readLine().split(" ");
        int n = Integer.parseInt(words[0]);
        int m = Integer.parseInt(words[1]);
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i= 0; i <n; i++) {
            hashMap.put(br.readLine(),1);
        }

        for (int i=0; i < m; i++) {
            String name = br.readLine();
            hashMap.put(name,hashMap.getOrDefault(name,0) + 1);
        }
        for (Map.Entry<String,Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() == 2) {
                arrayList.add(entry.getKey());
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList.size());
        for (String a : arrayList) {
            System.out.println(a);
        }
    }
}
