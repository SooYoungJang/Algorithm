package AlgorithmNumber.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum =0;
        if(n < 3 && m >1) {
            arrayList.add(2);
        }
        for (int i=n; i<= m; i++) {
            int checkValue = -1;
            for (int j=2; j < i; j++) {
                if(i % j == 0) { //소수가 아님.
                    checkValue = -1;
                    break;
                } else {
                    checkValue = i;
                }
            }

            if(checkValue != -1) {
                arrayList.add(checkValue);
            }
        }

        for (int b : arrayList) {
            sum += b;
        }
        if(arrayList.size() >0) {
            System.out.println(sum);
            System.out.println(arrayList.get(0));
        }else {
            System.out.println(-1);
        }
    }
}
