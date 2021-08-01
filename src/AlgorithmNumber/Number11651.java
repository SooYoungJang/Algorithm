package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Number11651 {
    public static void main(String[] args) throws IOException {
        // Y축 즉 세로 방향으로 정렬할때 사용 (오름차순으로 )

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        ArrayList<Spots> spotsArrayList = new ArrayList<>();
        for (int i=0; i < N; i++) {
            String[] spot = br.readLine().split(" ");
            spotsArrayList.add(new Spots(Integer.parseInt(spot[0]),Integer.parseInt(spot[1])));
        }
        Collections.sort(spotsArrayList);
        for (int i = 0; i < spotsArrayList.size(); i++) {
            sb.append(spotsArrayList.get(i).locationX + " " + spotsArrayList.get(i).locationY + "\n");
        }
        System.out.println(sb);
    }
}

class Spots implements Comparable<Spots> {

    public int locationX = 0;
    public int locationY = 0;

    public Spots(int locationX, int locationY) {
        this.locationX = locationX;
        this.locationY = locationY;
    }

    @Override
    public int compareTo(Spots o) {
        if(locationY == o.locationY) return locationX - o.locationX;
        return locationY - o.locationY;
    }
}
