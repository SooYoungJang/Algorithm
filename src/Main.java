import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(search(n));

    }

    private static int search(int n) {
        int[] tail = new int[n + 2];
        tail[0] = 0;
        tail[1] = 1;
        tail[2] = 2;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        for (int i = 3; i <= n; i++) {
            tail[i] = (tail[i - 2] + tail[i - 1]) % 10007;
        }

        return tail[n];
    }
}

