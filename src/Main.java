
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        //N개의 값이 주어진다.
        //N은 (x,y)로 이루어져있다.
        //x와 y 둘을 합한다.
        //합한 값으로 순위를 정하며 String[] 에 순위에 맞는 위치에 다시 넣어준다.

        //이중 for 문을 돌려서 시간초과 : 시간복잡도 O(N^2) 가 되었다;
        //다른 방안으로 Comparable

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] coordinate = new String[N];
        ArrayList<location> locationArrayList = new ArrayList<>();

        for (int i=0; i<N; i++) {
            coordinate[i] = br.readLine();
        }
        for (int i =0; i<coordinate.length; i++) {
            location location = new location(coordinate[i].split(" "));
            locationArrayList.add(location);
        }
        Collections.sort(locationArrayList);
        for (int i =0; i < locationArrayList.size(); i++) {
            sb.append(locationArrayList.get(i).locationX + " " + locationArrayList.get(i).locationY + "\n");
        }
        System.out.println(sb.toString());

    }
}

class location implements Comparable<location> {

    int locationX;
    int locationY;

    public location(String [] locationStrArray) {
        this.locationX = Integer.parseInt(locationStrArray[0]);
        this.locationY = Integer.parseInt(locationStrArray[1]);
    }

    @Override
    public int compareTo(location o) {
        if(locationX == o.locationX) return locationY - o.locationY;
        return locationX - o.locationX;
    }

}