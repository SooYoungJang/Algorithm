package AlgorithmNumber.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Number1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i=0; i< n; i++) {
            int inputNumber = Integer.parseInt(br.readLine());
            if(inputNumber == 0 && priorityQueue.isEmpty()) {
                System.out.println(0);
            }else if(inputNumber == 0) {
                System.out.println(priorityQueue.remove());
            }else {
                priorityQueue.offer(inputNumber);
            }
        }
    }
}
