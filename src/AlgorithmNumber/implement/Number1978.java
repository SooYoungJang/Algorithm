package AlgorithmNumber.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Number1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0; i<n; i++) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(cal(arrayList));
    }
    public static int cal(ArrayList<Integer> arrayList) {
        int count =0;
        for (int value : arrayList) {
            count++;
            for (int i=2; i < value; i++){
                if(value % i == 0) {
                    count--;
                    break;
                }
            }
            if(value == 1) {
                count--;
            }

        }
        return count;
    }
}
