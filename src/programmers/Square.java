package programmers;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Square {
    public static void main(String[] args) throws IOException {
        //프로그래머스 직사각형의 좌표찾기 문제

        int[][] arr = {{1,4},{3,4},{3,10}};
        int x = 0;
        int y = 0;
        Set<Integer> setX = new HashSet<>();
        Set<Integer> setY = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int[] inArr = arr[i];
            for (int j = 0; j < inArr.length; j++) {
                if(j % 2 == 0) {
                    if(!setX.add(inArr[j])) {
                        setX.remove(inArr[j]);
                    }

                }else {
                    if(!setY.add(inArr[j])) {
                        setY.remove(inArr[j]);
                    }
                }
            }
        }
        Iterator<Integer> iterSetX = setX.iterator();
        while(iterSetX.hasNext()) {
            x = iterSetX.next();
        }

        Iterator<Integer> iterSetY = setY.iterator();
        while(iterSetY.hasNext()) {
            y = iterSetY.next();
        }

        int[] answer = {x,y};
        System.out.println("[" + x + ", " + y+ "]");

    }
}
