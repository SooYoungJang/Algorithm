package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Number1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String first = br.readLine();
        String second = br.readLine();

        System.out.println(calcul(first,second));


    }
    private static int calcul(String first, String second) {
        int count= 0;
        HashMap<String,Integer> hashMap = new HashMap<>();
        String[] firsts = first.split("");
        String[] seconds = second.split("");

        for (int i =0; i< first.length(); i++) {
            hashMap.put(firsts[i], hashMap.getOrDefault(firsts[i],0) +1);
        }
        for (int i=0; i< second.length(); i++) {
            hashMap.put(seconds[i],hashMap.getOrDefault(seconds[i], 0) - 1);
        }

        for (Map.Entry<String,Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() != 0) {
                count += Math.abs(entry.getValue());
            }
        }

        return count;
    }
}
