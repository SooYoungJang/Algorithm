package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Number10815{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> arrayListA = new ArrayList<>();
            String[] strings = br.readLine().split(" ");
            for (int i=0; i < n; i++) {
                arrayListA.add(Integer.parseInt(strings[i]));
            }
            int m = Integer.parseInt(br.readLine());
            strings = br.readLine().split(" ");

            Collections.sort(arrayListA);

            for (int i=0; i < m; i++) {
                sb.append(binarySearch(arrayListA,n,Integer.parseInt(strings[i])));
            }


            System.out.println(sb);

        }

    private static String binarySearch(ArrayList<Integer> arrayListA, int n, int searchValue) {
        String result = "0 ";
        int first = 0;
        int last = n -1;
        int mid = 0;
        while (first <= last) {
            mid = (first + last) / 2;
            if(arrayListA.get(mid) == searchValue) {
                return "1 ";
            }

            if(arrayListA.get(mid) < searchValue) {
                first = mid +1;
            }else if(arrayListA.get(mid) > searchValue) {
                last = mid -1;
            }
        }

        return result;
    }
}