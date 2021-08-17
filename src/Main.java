import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[] dpArr;
    public static void main(String[] args) throws IOException {
        // 정수 n 을 1,2,3 의 합으로 나타내는 모든경우의 수를 구해라
        // 5일경우 ? 13
        // 4일경우 ? 7
        // 3일경우 ? 4
        // 2일경우 ? 2
        // 1일경우 ? 1
        //1+1+1+1
        //1+1+2
        //1+2+1
        //2+1+1
        //2+2
        //1+3
        //3+1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dpArr = new int[10 + 1];
        dpArr[0] = 0;
        dpArr[1] = 1;
        dpArr[2] = 2;
        dpArr[3] = 4;
        for (int i=4; i<10 + 1; i++) {
            dpArr[i] = -1;
        }
        for (int i=0; i< n; i++) {
            System.out.println(dpSum(Integer.parseInt(br.readLine())));
        }

    }
    private static int dpSum(int n) {
        if(dpArr[n] == -1) {
            dpArr[n] = dpSum(n-1) + dpSum(n-2) + dpSum(n-3);
        }

        return dpArr[n];
    }
}
