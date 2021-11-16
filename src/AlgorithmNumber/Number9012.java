package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
  

        for (int i=0; i < n; i++) {
            String[] str = br.readLine().split("");
            boolean b = false;
            for (int j =0; j < str.length; j++) {
                if (str[j].equals(")")) {
                    b = true;
                   if(!stack.isEmpty()) {
                       b = false;
                       stack.pop();
                   }
                } else {
                    b = true;
                    stack.push(str[j]);
                }
            }
            if(stack.isEmpty() && !b) {
                sb.append("YES\n");
            }else {
                sb.append("NO\n");
            }
            stack.clear();

        }

        System.out.println(sb);
    }
}