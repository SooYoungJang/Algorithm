import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static Set<Integer> set = new HashSet<>();
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] call = br.readLine().split(" ");
            callMethod(call);
        }
        System.out.println(sb);
    }

    private static void callMethod(String[] callValue) {
        int value = 0;
        if(callValue.length == 2) {
            value = Integer.parseInt(callValue[1]);
        }
        String method = callValue[0];
        if(method.equals("add")) {
            set.add(value);
        }else if(method.equals("remove")){
            set.remove(value);
        }else if(method.equals("check")){
            if(set.contains(value)) {
                sb.append("1").append("\n");
            }else {
                sb.append("0").append("\n");
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