package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Number11650 {
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
        String[] coordinateSorting = new String[N];
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


//        for (int i=0; i<coordinate.length; i++) {
//            String[] coordinateArray = coordinate[i].split(" ");
//            int coordinateX = Integer.parseInt(coordinateArray[0]);
//            int coordinateY = Integer.parseInt(coordinateArray[1]);
//            int count = getArraySort(coordinate,coordinateX+coordinateY);
//            coordinateSorting[count] = coordinate[i];
//        }
//        for (int i =0; i < coordinateSorting.length; i++) {
//            sb.append(coordinateSorting[i]).append("\n");
//        }
//            System.out.println(sb.toString());
//    }
//
//    private static int getArraySort(String[] coordinate, int coordinateSum) {
//        int count = 0;
//        for (int i =0; i<coordinate.length; i++) {
//            String[] oneCoordinate = coordinate[i].split(" ");
//            int oneSum = Integer.parseInt(oneCoordinate[0]) + Integer.parseInt(oneCoordinate[1]);
//            if(coordinateSum > oneSum) {
//                count ++;
//            }
//        }
//        return count;
//    }

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
        return locationX - o.locationY;
    }

}