package AlgorithmNumber.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number5598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        String strings = "";
        for (int i=0; i< chars.length; i++) {
            Character character = Character.valueOf((char) (chars[i]-3));
            if(String.valueOf(character).equals(">")) {
                strings = strings.concat("X");
            }else if(String.valueOf(character).equals("?")) {
                strings = strings.concat("Y");
            }else if(String.valueOf(character).equals("@")) {
                strings = strings.concat("Z");
            }else {
                strings = strings.concat(String.valueOf(character));
            }
        }
        System.out.println(strings);
    }
}
