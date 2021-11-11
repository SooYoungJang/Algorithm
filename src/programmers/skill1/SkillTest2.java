package programmers.skill1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SkillTest2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] participant = br.readLine().split(" ");
        String[] completion = br.readLine().split(" ");
//        System.out.println(solution(participant,completion));

        int [] aavvv = {4,3,2,1};
        int [] aab = new int[aavvv.length];
        aab = aavvv;

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i=0; i < aavvv.length; i++) {
            arrayList.add(String.valueOf(aavvv[i]));
        }
        Arrays.sort(aab);
        int min = aab[0];
        arrayList.remove(String.valueOf(min));


        for (String ss : arrayList) {
            System.out.println(ss);
        }

    }

    public static String solution(String[] participant, String[] completion) {
        //완주하지 못하는 선수는 무조건 1명.
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) +1);
        }
        for(int i=0; i < completion.length; i++) {
            map.put(completion[i], map.getOrDefault(completion[i], 0) -1);
        }
        for (Map.Entry<String ,Integer> entry : map.entrySet()) {
            if(entry.getValue() != 0) {
                return entry.getKey();
            }
        }

        return answer;
    }
}

