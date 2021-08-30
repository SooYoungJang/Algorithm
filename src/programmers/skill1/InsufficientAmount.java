package programmers.skill1;

import java.io.IOException;

public class InsufficientAmount {
    public static void main(String[] args) throws IOException {
        System.out.println(solution(3,20,4));
    }
    public static long solution(int price, int money, int count) {
        long answer = -1;
        //count 만큼 price를 배수해주고, 마지막에 money를 뺀값을 리턴.
        long result =0;
        for(int i=1; i<= count; i++) {
            result = result+(price * i);
        }
        answer = result - money;
        if(answer <= 0) {
            answer = 0;
        }
        return answer;
    }
}


