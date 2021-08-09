package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;
import java.util.stream.Stream;

public class Number10773 {
    private static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i=0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            calculSum(value);
        }

        for (int i=0; i < stack.size(); i++) {
            sum += stack.get(i);
        }

        System.out.println(sum);


    }

    public static void calculSum(int value) {
        if(value == 0) {
            if(!stack.isEmpty()) {
                stack.pop();
            }
        }else {
            stack.push(value);
        }

    }
}
