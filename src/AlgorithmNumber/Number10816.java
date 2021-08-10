package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        String[] strings = br.readLine().split(" ");
        int [] intArray = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < n; i++) {
            hashMap.put(intArray[i], hashMap.getOrDefault(intArray[i],0) +1);
        }
        int m = Integer.parseInt(br.readLine());
        strings = br.readLine().split(" ");
        int [] intArrayB = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
        for (int i =0; i < m; i++) {
            sb.append(hashMap.getOrDefault(intArrayB[i] , 0)).append(" ");
        }
        System.out.println(sb);


    }

}
