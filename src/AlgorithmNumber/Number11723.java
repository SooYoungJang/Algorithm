package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Number11723 {
    public static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] call = br.readLine().split(" ");
            callMethod(call[0],Integer.parseInt(call[1]));
        }

    }

    private static void callMethod(String method, int value) {
        if(method.equals("add")) {
            set.add(value);
        }else if(method.equals("remove")){
            set.remove(value);
        }else if(method.equals("check")){
            if(set.contains(value)) {
                System.out.println(1);
            }else {
                System.out.println(0);
            }

        }else if(method.equals("toggle")){
            if(!set.add(value)) {
                set.remove(value);
            }
        }else if(method.equals("all")){
            for (int i = 1; i<21; i++) {
                set.add(i);
            }
        }else if(method.equals("empty")){
            set.clear();
        }
    }
}
