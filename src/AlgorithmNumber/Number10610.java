package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //102 = 210 으로.
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        String[] values = br.readLine().split("");
        ArrayList<String> arrayList = new ArrayList<>();
        String maxValue = "";
        int outPut = 0;

        for (int i =0; i < values.length; i++) {
            arrayList.add(values[i]);
        }

        Collections.sort(arrayList);

        for (String str : arrayList) {
            maxValue += str;
        }

        while (true) {
            if(Integer.parseInt(maxValue) % 30 == 0) {

            } else if(Integer.parseInt(maxValue) % 3 == 0) {

            } else {
                outPut = -1;
                break;
            }
        }
        System.out.println(outPut);
    }
}