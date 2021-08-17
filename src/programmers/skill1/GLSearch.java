package programmers.skill1;

import java.io.IOException;

public class GLSearch {
    public static void main(String[] args) throws IOException {

        int a = gcd(2,10);

        System.out.println(a);
    }

    private static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        else {
            return gcd(b, a % b);
        }
    }
}
