package AlgorithmNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Number2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int card = Integer.parseInt(br.readLine());
        System.out.println(cardSuffle(card));

    }
    private static int cardSuffle(int cardNumber) {
        int cardSize = cardNumber;
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i= 1; i <= cardNumber; i++) {
            arrayDeque.addLast(i);
        }
        while (cardSize != 1) {
            arrayDeque.pop();
            arrayDeque.addLast(arrayDeque.pop());
            cardSize--;
        }

        
        return arrayDeque.pop();
    }
}
