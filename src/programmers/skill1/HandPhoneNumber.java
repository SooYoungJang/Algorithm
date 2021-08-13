package programmers.skill1;

import java.io.IOException;

public class HandPhoneNumber {
    public static void main(String[] args) throws IOException {

        System.out.println(solution("01033334444"));
    }

        private static  String solution(String phone_number) {
            String answer = "";
            String[] _phones = phone_number.split("");
            int count = 0;
            for (int i=_phones.length; i > 0; i--) {
                if(count < 4) {
                    count++;
                    answer = _phones[i-1].concat(answer);
                }else {
                    answer = "*".concat(answer);
                }
            }

            return answer;
        }

}
