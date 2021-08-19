package programmers.skill1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class NamberReverse {
    public static void main(String[] args) throws IOException {
        long n = 12345L;
        System.out.println(solution(n));
    }

    public static int[] solution(long n) {
        int[] answer = {};
        String[] strArr = String.valueOf(n).split("");
        int[] intArr = new int[strArr.length];
        ArrayList<String> arrlist = new ArrayList<>();
        for (int i=0; i< strArr.length; i++) {
            arrlist.add(strArr[i]);
        }
        Collections.reverse(arrlist);

        for (int i=0; i < strArr.length; i++){
            intArr[i] = Integer.parseInt(arrlist.get(i));
        }

        answer = intArr;

        return answer;
    }
}
