package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Number10814 {
    public static void main(String[] args) throws IOException {
        //N 명의 유저가있으며, 입력순이 곧 가입한 시간순입니다.
        //나이로 먼저 오름차순으로 정렬을하며, 같은 나이라면 먼저입력 가입한 순으로 오름차순으로 출력합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<user> userArrayList  = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i =0; i < n; i++) {
            String[] userStr = br.readLine().split(" ");
            userArrayList.add(new user(userStr[0],userStr[1]));
        }
        Collections.sort(userArrayList);

        for (int i=0; i < userArrayList.size(); i++) {
            sb.append(userArrayList.get(i).age + " " + userArrayList.get(i).name + "\n");
        }
        System.out.println(sb.toString());

    }
}

class user implements Comparable<user> {
    public int age = 0;
    public String name = "";

    public user(String age, String name) {
        this.age = Integer.parseInt(age);
        this.name = name;
    }

    @Override
    public int compareTo(user o) {
     return age - o.age;
    }
}
