package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number6443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i< n; i++) {
            char[] chars = br.readLine().toCharArray();
//            anaGram(chars);
        }

    }

    private static String anaGracm(char[] chars) {
        Arrays.sort(chars);

        return "";
    }

}
