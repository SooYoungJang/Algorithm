package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(br.readLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        for (int i=0; i< n; i++) {
            queueFun(br.readLine(),queue);
        }

    }

    private static void queueFun(String order, ArrayDeque<String> queue) {
        switch (order) {
            case "front":
                if(!queue.isEmpty()) System.out.println(queue.peek());
                else System.out.println("-1");
            break;
            case "back":
                if(!queue.isEmpty()) System.out.println(queue.peekLast());
                else System.out.println("-1");
                break;
            case "size": System.out.println(queue.size());
                break;
            case "empty":
                if(!queue.isEmpty()) System.out.println("0");
                else System.out.println("1");
                break;
            case "pop":
                if(!queue.isEmpty()) System.out.println(queue.pop());
                else System.out.println("-1");
                break;
            default:
                String[] strArr = order.split(" ");
                queue.add(strArr[1]);
                break;
        }
    }
}