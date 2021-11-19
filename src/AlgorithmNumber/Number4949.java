package AlgorithmNumber;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Number4949 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            String s = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            Stack<Integer> type = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '[') {
                    if (s.charAt(i) == '(') {
                        type.push(1);
                    } else {
                        type.push(2);
                    }
                    stack.push(s.charAt(i));
                } else if (s.charAt(i) == ')' || s.charAt(i) == ']') {
                    if (stack.isEmpty()) {
                        System.out.println("no");  
                        break;
                    }
                    if(s.charAt(i) == ')' && type.peek() == 2) {
                        System.out.println("no");
                        break;
                    }else if(s.charAt(i) == ']' && type.peek()  == 1) {
                        System.out.println("no");
                        break;
                    }
                    else {
                        stack.pop();
                        type.pop();
                    }
                }
                if (i == s.length()-1 && stack.isEmpty()) {
                    System.out.println("yes");
                    break;
                }else if(i == s.length() -1 && !stack.isEmpty()) {
                    System.out.println("no");
                    break;
                }
            }
        }

    }
}
