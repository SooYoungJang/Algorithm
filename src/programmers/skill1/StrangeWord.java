package programmers.skill1;

import java.io.IOException;

public class StrangeWord {
    public static void main(String[] args) throws IOException {
        //〉	"TrY HeLlO WoRlD"

        System.out.println(solution("try hello world"));
    }
    public static String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();

        String convert = "";
        for(int i=0; i<charArr.length; i++) {
            if(charArr[i] >= 'a' && charArr[i] <= 'z') {
                if(i % 2 == 0) {
                    System.out.println("??? "+i);
                    convert = String.valueOf(charArr[i]).toUpperCase();
                    answer = answer+convert;
                }else {

                    System.out.println("???11 "+i);
                    convert = String.valueOf(charArr[i]).toLowerCase();
                    answer = answer+convert;
                }
            }else if(charArr[i] >= 'A' && charArr[i] <= 'Z') {
                if(i % 2 == 0) {
                    System.out.println("??? "+i);
                    convert = String.valueOf(charArr[i]).toUpperCase();
                    answer = answer+convert;
                }else {

                    System.out.println("???11 "+i);
                    convert = String.valueOf(charArr[i]).toLowerCase();
                    answer = answer+convert;
                }
            }else {
                convert = String.valueOf(charArr[i]);
                answer = answer+convert;
            }

        }


        return answer;
    }
}



