package AlgorithmNumber.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] scores = new long[n];
        double sum = 0;
                for (int i=0; i< scores.length; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        long max = scores[0];
        for (int i=0; i<scores.length; i++) {
            if(max < scores[i]) {
                max = scores[i];
            }
        }
        for (int i=0; i< scores.length; i++) {
            sum += Double.parseDouble(String.valueOf(scores[i])) / max * 100;

        }

        double result = sum/n;

        result =  (Math.round(result * 1000000) / 1000000.0);
        System.out.println(result);
    }
}
