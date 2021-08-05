import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // N 개의 수에서 오름차순으로 정령 후, k 번째 값을 구해라.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for (int i=1; i <= n; i ++) {
            integerArrayList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(integerArrayList);
        System.out.println(integerArrayList.get(k -1));

    }
}