package programmers.skill2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class BigNumber {
    public static void main(String[] args) throws IOException {

        System.out.println(solution(new int[]{3,5,10,20,30}));
    }
    public static String solution(int[] numbers) {
        String answer = "";
        String[] numStrs = new String[numbers.length];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< numbers.length; i++) {
            numStrs[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numStrs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        for (String a : numStrs) {
            sb.append(a);
        }
        if(numStrs[0].equals("0")) {
            return "0";
        }

        return sb.toString();
    }
}
