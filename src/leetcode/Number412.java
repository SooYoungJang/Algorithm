package src.leetcode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Number412 {
    public static void main(String[] args) throws IOException {
        System.out.println(fizzBuzz(5));
    }
    public static List<String> fizzBuzz(int n) {
        String fizz = "Fizz";
        String buzz = "Buzz";

        List<String> list = new ArrayList<>();
        for(int i=1; i<= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                list.add(fizz+buzz);
                continue;
            }
            if(i % 3 == 0) {
                list.add(fizz);
                continue;
            }
            if(i % 5  == 0) {
                list.add(buzz);
                continue;
            }
            list.add(String.valueOf(i));
        }
        return list;
    }
}
