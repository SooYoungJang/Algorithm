package programmers.skill1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        if (n == m) {
            System.out.println(n);
        }else {
            System.out.println(sum2(n,m));

        }

    }
    private static int sum2(int n, int m ) {

        int maxNumber = Math.max(n,m);
        int minNumber = Math.min(n,m);
        int sum = minNumber;
        int diff = maxNumber - minNumber;
        for (int i=1; i <= diff; i++) {
            sum+= minNumber + i;
        }
        return sum;
    }

    public static int sum(int n, int m) {
        int sum = 0;
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add(String.valueOf(n));
        arrayList.add(String.valueOf(m));
        int diff = 0;
        if(n > m) {
            diff = n - m;
            arrayList.remove(String.valueOf(n));
        }else{
            diff = m-n;
            arrayList.remove(String.valueOf(m));
        }

        sum = Integer.parseInt(arrayList.get(0));
        for (int i=1; i<= diff; i++) {
            sum += Integer.parseInt(arrayList.get(0)) + i;
        }
        return sum;
    }
}
