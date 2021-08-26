package AlgorithmNumber.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Number2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char [] chars = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        Stack<Integer> scores = new Stack<>();
        int checkBigCount = 0;
        int checkSmallCount = 0;
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        String str = "";
        for (int i=0; i< chars.length; i++) {
            if(chars[i] =='(' || chars[i] == '[') {
                if(chars[i] =='(') {
                    str += "( 2 * ";
                    scores.push(2);
                    checkBigCount++;
                }else {
                    str += "( 3 * ";
                    checkSmallCount++;
                    scores.push(3);
                }
                stack.push(chars[i]);
            }else {
                if(!stack.isEmpty()) {
                    if(chars[i] ==')') {
                        if(stack.peek() == '(') {
                            scores.pop();
                            stack.pop();
                            str += " 1) + ";
                        }else if(stack.peek() == '[') {
                            System.out.println(0);
                        }
                    }else if(chars[i] == ']') {
                        if(stack.peek() == '[') {
                            stack.pop();
                            str += " 1) + ";
                        }else if(stack.peek() == '(') {
                            System.out.println(0);
                        }
                    }
                }else {
                    System.out.println(0);
                }

            }

        }
        System.out.println(str);
    }
}
