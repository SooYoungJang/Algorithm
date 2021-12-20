package src.AlgorithmNumber.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Number18258 {
    static ArrayDeque<String> queue = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        //push X: 정수 X를 큐에 넣는 연산이다.
        //pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        //size: 큐에 들어있는 정수의 개수를 출력한다.
        //empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
        //front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        //back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

        //예제
        //15
        //push 1
        //push 2
        //front
        //back
        //size
        //empty
        //pop
        //pop
        //pop
        //size
        //empty
        //pop
        //push 3
        //empty
        //front
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(br.readLine());

        for (int i=0; i< n; i++) {
            queueFun(br.readLine());
        }

    }
    private static void queueFun(String order) {
        switch (order) {
            case "front": {
                if(!queue.isEmpty()) System.out.println(queue.peek());
                else System.out.println("-1");
            }
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
                System.out.println("sdfsf " +strArr[0] + " gg  " + strArr[1]);
                queue.add(strArr[1]);
                break;
        }
    }
}
