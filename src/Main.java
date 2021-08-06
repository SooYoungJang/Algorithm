import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        //N 개의 갯수와 수가 주어지면 소수를 찾는다.
        // 소수란 : 1과 자기자신을 제외한 나머지 약수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] inputStrArray = br.readLine().split(" ");
        int[] inputIntArray = Stream.of(inputStrArray).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        for (int i=0; i < n; i++) {
//            System.out.println(calcul(inputIntArray[i]));
            count += calcul(inputIntArray[i]);
        }

        System.out.println(count);

    }
    private static int calcul(int inputNumber) {
        int count =0;
        for (int i = 2; i < inputNumber -1; i++) {
            if(inputNumber % i == 0) {
                count = 1;
                break;
            }else if(inputNumber % i != 0){
                count = 0;
            }
        }
        if(count == 1) {
            count = 0;
        }else {
            count = 1;
        }
        if (inputNumber == 1) {
            count = 0;
        }

        return count;
    }
}


