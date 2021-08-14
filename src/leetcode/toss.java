package leetcode;

import java.io.IOException;
import java.util.Calendar;


//toss 1번 문제
//date 에는 토스신용카드 발급 신청 날짜(yyyyMMdd)가 주어집니다. 이 날짜는 토스신용카드 발급 가능 여부를 판단하는 기준 날짜가 됩니다.
//requests 에는 토스신용카드 발급을 신청한 사람들의 이름과 생년월일(yyyyMMdd)이 주어집니다. 이름과 생년월일 사이에는 공백 없이 쉼표(,)로 구분합니다.
//["김토스,19900605", "이토스,20020729"]
//출력 설명
//토스신용카드 신청자 중, 발급 가능한 사람의 수를 반환합니다.
public class toss {
    public static void main(String[] args) throws IOException {
        //만 19세 이상부터 카드발급가능 즉. yyyyMMdd가 들어옴.
        String[] ss = new String[] {"김토스,19900605", "이토스,20020729"};
        solution("20210701",ss);
    }

    private static int solution(String date, String[] requests) {
        int answer = 0;
        return answer;
    }
}
