package programmers.skill1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class FailureRate {
    public static void main(String[] args) throws IOException {
        System.out.println(solution(4,new int[]{4,4,4,4,4}));

    }
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int totalPerson = stages.length;
        int someone = 0;
        ArrayList<FailP> arrlist = new ArrayList<>();
        Arrays.sort(stages);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<stages.length; i++) {
            if(stages[i] > N) {
                map.put(N,map.getOrDefault(N,0));
            }else {
                map.put(stages[i],map.getOrDefault(stages[i],0) +1);
            }
        }

        for (int i = 1; i<=N; i++) {
            if(map.get(i) != null) {
                double person = (totalPerson - someone);
                double value = map.get(i) / person;
                arrlist.add(new FailP(i,value));
                someone = someone + map.get(i);
            }else {
                arrlist.add(new FailP(i,0));
            }
        }
        Collections.sort(arrlist);
        int count = 0;
        for(FailP failp: arrlist) {
            answer[count++] = failp.stage;
        }
        return answer;
    }
    public static class FailP implements Comparable<FailP>{
        int stage = 0;
        double fail = 0.0;
        public FailP(int stage, double fail) {
            this.stage = stage;
            this.fail = fail;
        }

        @Override
        public int compareTo(FailP o) {
            if(o.fail == this.fail) return this.stage - o.stage;
            return Double.compare(o.fail, this.fail);
        }
    }
}