import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        //N 만큼의 사람이 입력된다.
        //N 은 몸무게 x와 키 y로 이루어져 있다.
        //N의 순위를 구한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> grade = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        String[] people = new String[N];
        for (int i = 0; i < N; i++) {
            people[i] = br.readLine();
        }

        for (int i =0; i < people.length; i++) {
            String[] duff = people[i].split(" ");
            grade.add(getGrade(people,duff[0],duff[1]));
        }

        for (int i =0; i < grade.size(); i++) {
            sb.append(grade.get(i).toString()).append(" ");
        }

        System.out.println(sb.toString());

    }
    private static int getGrade(String[] people, String personX, String personY) {
        int count =1;
        int personXInt = Integer.parseInt(personX);
        int personYInt = Integer.parseInt(personY);
        for (int i =0; i< people.length; i++) {
            String[] duff = people[i].split(" ");
            int weight = Integer.parseInt(duff[0]);
            int height = Integer.parseInt(duff[1]);
            if(personXInt < weight && personYInt < height) {
                count++;
            }
        }
        return count;
    }
}
