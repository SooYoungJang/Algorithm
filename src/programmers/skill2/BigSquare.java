package programmers.skill2;

import java.io.IOException;

public class BigSquare {
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        System.out.println(solution(new int[][]{{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{0,0,1,1,1}}));
    }

    public static int solution(int[][] board) {
        int answer = 1234;


        int max = 0;
        for(int i=1; i<board.length; i++) {
            for(int j=1; j<board[i].length; j++) {
                int value = Math.min(board[i-1][j-1], Math.min(board[i-1][j] , board[i][j-1]));
                if(value != 0) board[i][j] = board[i][j] + value;
                if(max < board[i][j]){
                    max = board[i][j];
                }
            }
        }
        answer = max * max;
        return answer;
    }
}
