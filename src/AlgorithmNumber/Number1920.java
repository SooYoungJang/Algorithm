package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Number1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());

        //asdf

        String[] stringsN = br.readLine().split(" ");
        for (int i=0; i< stringsN.length; i++) {
            set.add(stringsN[i]);
        }
        int m = Integer.parseInt(br.readLine());
        String[] stringsM = br.readLine().split(" ");

        for (int i=0; i < stringsM.length; i++) {

            if(set.add(stringsM[i])) {
                sb.append("0\n");
            }else {
                sb.append("1\n");
            }
        }
        System.out.println(sb);
    }
}
