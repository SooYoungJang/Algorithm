package programmers.skill1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DartGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 다트 결과 예로 1s2t*3d# 식으로 들어옴. 총점수 계산.
        String dartResult = br.readLine();
        char[] chars = dartResult.toCharArray();
        int round1 = 0;
        int round2 = 0;
        int round3 = 0;
        int count =0;
        for (int i=0; i < chars.length; i++) {
                if(chars[i] >= '0' && chars[i] <= '9') {
                    count++;
                    if(count == 1) {
                        round1 = (int) chars[i] - '0';
                        if(chars[i] == '1' && chars[i+1] == '0') {
                            i++;
                            round1 = 10;
                        }
                    }else if(count == 2){
                        round2 = (int) chars[i] - '0';
                        if(chars[i] == '1' && chars[i+1] == '0') {
                            i++;
                            round2 = 10;
                        }
                    }else if (count== 3) {
                        round3 = (int) chars[i] - '0';
                        if(chars[i] == '1' && chars[i+1] == '0') {
                            i++;
                            round3 = 10;
                        }
                    }

                }else if (chars[i] == 'S' || chars[i] == 'D' || chars[i] == 'T') {
                    System.out.println("?? =222 " + chars[i]);
                    if(count == 1) {
                        if(chars[i] == 'S') {
                            round1 = round1;
                        }else if(chars[i] == 'D') {
                            round1 = round1 * round1;
                        }else {
                            round1 = round1 * round1 * round1;
                        }
                    }else if (count == 2) {
                        if(chars[i] == 'S') {
                            round2 = round2;
                        }else if(chars[i] == 'D') {
                            round2 = round2 * round2;
                        }else {
                            round2 = round2 * round2 * round2;
                        }
                    }else if (count == 3) {
                        if(chars[i] == 'S') {
                            round3 = round3;
                        }else if(chars[i] == 'D') {
                            round3 = round3 * round3;
                        }else {
                            round3 = round3 * round3 * round3;
                        }
                    }

                }else if(chars[i] == '*' || chars[i] == '#') {
                    System.out.println("?? =333 " + chars[i]);
                    if(count == 1) {
                        if(chars[i] == '*') {
                            round1 = round1 * 2;
                        }else if (chars[i] == '#') {
                            round1 = round1 * (-1);
                        }
                    }else if (count == 2) {
                        if(chars[i] == '*') {
                            round1 = round1 * 2;
                            round2 = round2 * 2;
                        }else if (chars[i] == '#') {
                            round2 = round2 * (-1);
                        }
                    }else if (count == 3) {
                        if(chars[i] == '*') {
                            round2 = round2 * 2;
                            round3 = round3 * 2;
                        }else if (chars[i] == '#') {
                            round3 = round3 * (-1);
                        }
                    }

                }
        }
        System.out.println(round1+round2+round3);
    }
}
