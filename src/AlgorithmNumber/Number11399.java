package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Number11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        int sum = 0;
        int person = Integer.parseInt(br.readLine());
        String[] timeStr = br.readLine().split(" ");
        ArrayList<Integer> arrayListTime = new ArrayList<>();
        for (int i =0; i < timeStr.length; i++) {
            arrayListTime.add(Integer.parseInt(timeStr[i]));
        }
        Collections.sort(arrayListTime);

        for (int i=0; i < arrayListTime.size(); i++) {
            sum = sum + arrayListTime.get(i);
            result += sum;
        }
        System.out.println(result);
    }
}
