package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int orderNuber = Integer.parseInt(br.readLine());

        for (int i = 0; i < orderNuber; i++) {
            String[] orderWord = br.readLine().split(" ");
            String order = orderWord[0];
            if(orderWord.length > 1) {
                String orderNum = orderWord[1];
                stack.push(Integer.parseInt(orderNum));
            }else {
                if (order.equals("pop")) {
                    if(stack.isEmpty()) {
                        sb.append("-1\n");
                    }else {
                        int value = stack.pop();
                        sb.append(value).append("\n");
                    }
                } else if (order.equals("size")) {
                    int value = stack.size();
                    sb.append(value).append("\n");
                } else if (order.equals("empty")) {
                    boolean value = stack.isEmpty();
                    if(value) {
                        sb.append("1\n");
                    }else {
                        sb.append("0\n");
                    }
                } else if (order.equals("top")) {
                    if(stack.isEmpty()) {
                        sb.append("-1\n");
                    }else {
                        int value = stack.pop();
                        stack.push(value);
                        sb.append(value).append("\n");
                    }
                }
            }

        }

        System.out.println(sb);
    }



}
