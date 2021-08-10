package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arrayList);


        sb.append(avg(arrayList, n)).append("\n");
        sb.append(centerValue(arrayList, n)).append("\n");
        sb.append(manyNumber(arrayList, n)).append("\n");
        sb.append(diff(arrayList, n)).append("\n");
        System.out.println(sb);

    }

    private static int avg(ArrayList<Integer> input, int n) {
        int result = 0;
        double sum = 0;
        double avg = 0.0;
        for (int i = 0; i < input.size(); i++) {
            sum += input.get(i);
        }
        avg = sum / n;
        result = Double.valueOf(Math.round(avg)).intValue();
        return result;
    }

    private static int centerValue(ArrayList<Integer> input, int n) {
        int result = 0;
        int center = Math.round(input.size() / 2);
        result = input.get(center);

        return result;
    }

    private static int manyNumber(ArrayList<Integer> input, int n) {
        int result = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int item : input) {
            if (input.contains(item)) {
                int count = hashMap.get(item) != null ? hashMap.get(item) + 1 : 0;
                hashMap.put(item, count);
            }
        }
        // for loop (entrySet())
        int count = 0;
        int preKey = 0;
        int preValue = 0;
        for (Map.Entry<Integer, Integer> entrySet : hashMap.entrySet()) {
            if (entrySet.getValue() > preValue) {
                result = entrySet.getKey();
            }
            if (entrySet.getValue() == preValue && entrySet.getValue() != 0) {
                if(entrySet.getKey() < preKey) {
                    result = preKey;
                }else {
                    result = entrySet.getKey();
                }
            }
            preValue = entrySet.getValue();
            preKey = entrySet.getKey();
        }
        Collections.sort(input);
        Collections.reverse(input);
        if (result == 0) {
            if (input.size() > 1) {
                result = input.get(input.size() - 2);
            } else {
                result = input.get(input.size() - 1);
            }
        }
        return result;
    }

    private static int diff(ArrayList<Integer> input, int n) {
        Collections.sort(input);
        return input.get(input.size() - 1) - input.get(0);
    }
}
