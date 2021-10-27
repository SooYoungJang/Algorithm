package src.leetcode;

import java.io.IOException;

public class Number657 {
    public static void main(String[] args) throws IOException {
        System.out.println(judgeCircle("gdgdrrr3"));
    }

    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'U') y++;
            else if (ch == 'D') y--;
            else if (ch == 'R') x++;
            else if (ch == 'L') x--;
        }
        return x == 0 && y == 0;
    }

}
