package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Number10845 {
    public static ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i< n; i++) {
            String result = order(br.readLine().split(" "));
            if(!result.equals("")){
                sb.append(result).append("\n");
            }
        }

        System.out.println(sb);

    }
    public static String order(String[] orders) {
        String orderName = orders[0];
        String outPut = "";
        int orderValue = 0;
        if(orders.length > 1) {
            orderValue = Integer.parseInt(orders[1]);
        }
        if(orderName.equals("push")) {
            arrayDeque.addFirst(orderValue);
        }else if(orderName.equals("pop")) {
            if(arrayDeque.isEmpty()) {
                return "-1";
            }else {
                return String.valueOf(arrayDeque.pollLast());
            }
        }else if(orderName.equals("size")) {
            return String.valueOf(arrayDeque.size());
        }else if(orderName.equals("empty")) {
            if(arrayDeque.isEmpty()) {
                return "1";
            }else {
                return "0";
            }
        }else if(orderName.equals("front")) {
            if(arrayDeque.isEmpty()) {
                return "-1";
            }else {
                return String.valueOf(arrayDeque.peekLast());
            }
        }else if(orderName.equals("back")) {
            if(arrayDeque.isEmpty()) {
                return "-1";
            }else {
                return String.valueOf(arrayDeque.peekFirst());
            }
        }
        return outPut;
    }
}
