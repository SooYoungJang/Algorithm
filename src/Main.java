import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //유클리드 호제법 알고리즘.
        //두 자연수에서 최대 공약수와 최대 공배수 구하기.
        //유클리드 호제법을 사용하면 최대 공약수를 구할 수 있으며,
        //두 수를 곱한 후 최대공약수를 나누어주면 최대 공배수가 됩니다.
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String[] qeust = br.readLine().split(" ");
        int a=Integer.parseInt(qeust[0]);
        int b= Integer.parseInt(qeust[1]);
        int gcd = 0, lcm = 0, r = 1;

        gcd = gcd(a,b,r);
        lcm = (a * b) / gcd;

        stringBuilder.append(gcd).append("\n");
        stringBuilder.append(lcm);

        System.out.println(stringBuilder.toString());
    }

    private static int gcd(int a, int b, int r) {
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
