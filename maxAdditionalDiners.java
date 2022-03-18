import java.util.Arrays;

/**
 * A cafeteria has N seats in a row. The array S represents seats that are currently in use
 * In order to social distance, K spaces to the left and right of each diner must be empty
 * This program calculates the maximum additional diners that can be added to the cafeteria
 */

public class maxAdditionalDiners {

    public long getMaxAdditionalDinersCount(long N, long K, int M, long[] S) {
        long increment = K + 1;
        long diners = 0;
        Arrays.sort(S);

        diners += (S[0] - 1) / increment; //how many diners can sit to the left of the leftmost diner
        diners += (N - S[M - 1]) / increment; //how many diners can sit to the right of the rightmost diner

        //for each pair of diners, calculate how many diners can fit between them
        for (int i = 1; i < M; i++) {
            diners += ((S[i] - S[i - 1]) / increment) - 1;
        }

        return diners;
    }

}
