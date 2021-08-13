package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Number3778 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i =0; i < n * 2; i++) {
            System.out.println(anaGram(br.readLine(),br.readLine()));
        }
    }
    private static String anaGram(String firStr, String secStr) {
        char[] firChars = firStr.toCharArray();
        char[] secChars = secStr.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int count =0;
        for (char c : firChars) {
            hashMap.put(c,hashMap.getOrDefault(c,0) + 1);
        }
        for (char c : secChars) {
            if(hashMap.containsKey(c)) {
                hashMap.put(c,hashMap.get(c) -1 );
            }else {
                hashMap.put(c,hashMap.getOrDefault(c,0) + 1);
            }
        }
        for (Map.Entry<Character,Integer> entry : hashMap.entrySet()) {
            count += Math.abs(entry.getValue());
        }
        return "Case #2: "+count;
    }
}
