package programmers.skill1;

import java.io.IOException;

public class Collatz {
    static int count;
    public static void main(String[] args) throws IOException {
        int answer = 0;
        count =0;
        answer =  calcul(626331);
        System.out.println(answer);
    }

    private static int calcul(long input) {
        long n = (long) input;
        if(count >= 500) {
            return count = -1;
        }else if (n == 1) {
            return count;
        }
        else {
            if(n % 2 == 0) {
                n = n / 2;
                count++;
                calcul(n);
            }else if(n % 2 != 0) {
                n = (n * 3) + 1;
                count++;
                calcul(n);
            }
        }
        return count;
    }
//    private static int calcul(int input) {
//        int count =0;
//        long n = (long) input;
//        while (n != 1) {
//            if(count >= 500) {
//                count = -1;
//                break;
//            }
//            if(n % 2 == 0) {
//                n = n / 2;
//                count++;
//            }else if(n % 2 != 0) {
//                n = (n * 3) + 1;
//                count++;
//            }
//
//        }
//        return count;
//    }
}
