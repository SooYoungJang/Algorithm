package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Number2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> lope = new ArrayList<>();
        for (int i=0; i < n; i++) {
            //lope
            lope.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(lope);
        int max = 0;
        int weight =0;

        for (int i=0; i < lope.size(); i++) {
            weight = lope.get(i) * (lope.size() - i );
            max = Math.max(max, weight);
        }

            System.out.println(max);
    }
}
