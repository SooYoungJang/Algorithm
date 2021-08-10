package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Number1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> aArrayList = new ArrayList<>();
        ArrayList<String> bArrayList = new ArrayList<>();
        ArrayList<Integer> valueList = new ArrayList<>();
        String[] strings = br.readLine().split(" ");

        for (int i=0; i < n; i++) {

            aArrayList.add(Integer.parseInt(strings[i]));
        }
        strings = br.readLine().split(" ");
        for (int i=0; i < n; i++) {
            bArrayList.add(strings[i]);
        }
        Collections.sort(aArrayList);

        for (int i=0; i < n; i++) {
            int bValue =0;
            for (int k =0; k < bArrayList.size(); k++) {
                if(Integer.parseInt(bArrayList.get(k)) > bValue) {
                    bValue = Integer.parseInt(bArrayList.get(k));
                }
            }
            bArrayList.remove(String.valueOf(bValue));
            valueList.add(aArrayList.get(i) * bValue);
        }
        int sum =0;
        for (int a : valueList) {
            sum += a;
        }

        System.out.println(sum);

    }
}