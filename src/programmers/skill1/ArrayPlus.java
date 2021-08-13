package programmers.skill1;

import java.io.IOException;
import java.util.ArrayList;

public class ArrayPlus {
    public static void main(String[] args) throws IOException {
        int[][] test = {{1,2},{2,3}};
        int[][] test1 = {{3,4}, {5,6}};
        solution(test,test1);
    }

        public static int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = {};
            ArrayList<Integer> arrayA = new ArrayList<>();
            ArrayList<Integer> arrayB = new ArrayList<>();
//            System.out.println(arr1[0].length);
            int arraySize = arr1.length;
            int array2Size = 0;

            for (int i=0; i< arr1.length; i++) {
                array2Size = arr1[i].length;
                for (int j=0; j< arr1[i].length; j++) {
                    arrayA.add(arr1[i][j]);
                }
            }

            answer = new int[arraySize][array2Size];

            for (int i=0; i< arr1.length; i++) {
                for (int j=0; j< arr1[i].length; j++) {
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

            for (int i=0; i< answer.length; i++) {
                for (int j=0; j< answer[i].length; j++) {
                    System.out.println(answer[i][j]);
                }
            }

            return answer;

    }
}
