package AlgorithmNumber.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number9093 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String v = "";
        int n = Integer.parseInt(br.readLine());
        Stack<String> stringStack = new Stack<>();
        for (int i=0; i < n; i++) {
            String[] strings  = br.readLine().split("");
            for (int j =0; j<strings.length; j++) {
                stringStack.push(strings[j]);
            }

            while (!stringStack.isEmpty()) {
                v = v.concat(stringStack.pop());
            }
            String[] ss = v.split(" ");
            v = "";
            for (int a = 0; a< ss.length; a++) {
                v = ss[a].concat(" ").concat(v);
            }
            System.out.println(v);
        }
    }
}
