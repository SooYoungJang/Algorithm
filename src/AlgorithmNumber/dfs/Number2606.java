package AlgorithmNumber.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Number2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        int pcCount = Integer.parseInt(br.readLine());
        int pcPair = Integer.parseInt(br.readLine());
        ArrayList<compair> compairArrayList = new ArrayList<>();

        for (int i=0; i<pcPair; i++) {
            String[] strArr = br.readLine().split(" ");
            compairArrayList.add(new compair(Integer.parseInt(strArr[0]),Integer.parseInt(strArr[1])));
        }

        Collections.sort(compairArrayList);

        for (int i =0; i< compairArrayList.size(); i++) {
            if(compairArrayList.get(i).x == 1) {
                arrayDeque.push(compairArrayList.get(i).y);
            }
        }

    }
    static class compair implements Comparable<compair> {
        int x = 0;
        int y = 0;

        public compair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(compair o) {
            return x - o.x;
        }
    }
}
