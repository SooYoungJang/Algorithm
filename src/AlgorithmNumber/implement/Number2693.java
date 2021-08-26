package AlgorithmNumber.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Number2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            ArrayList<Cmp> arrayList = new ArrayList<>();
            for(int j=0; j<10; j++) {
                arrayList.add(new Cmp(Integer.parseInt(st.nextToken())));
            }
            Collections.sort(arrayList);
            System.out.println(arrayList.get(2).x);
        }
    }
    public static class Cmp implements Comparable<Cmp> {

        int x = 0;

        public Cmp(int x) {
            this.x = x;
        }

        @Override
        public int compareTo(Cmp o) {
            return o.x - x;
        }
    }
}
