package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Number11004 {
    public static void main(String[] args) throws IOException {
        // N 개의 수에서 오름차순으로 정령 후, k 번째 값을 구해라.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] numbers = br.readLine().split(" ");
        int n = Integer.parseInt(numbers[0]);
        int k = Integer.parseInt(numbers[1]);

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i=1; i <= n; i ++) {
            integerArrayList.add(i);
        }

        System.out.println(integerArrayList.get(k - 1));


    }
}

