import java.util.Arrays;

/**
 * There is a programming competition with N competitors where each person
 * is trying to solve a set of problems worth either 1 or 2 points
 * The array S represents the point totals of each person
 *
 * Using the information determine the minimum amount of problems
 * that can create the array of point totals
 */

public class getMinProblemCount {

    public int getMinProblemCount(int N, int[] S) {
        //Sort the array
        Arrays.sort(S);
        //get the maximum point total
        int max = S[N-1];

        //the minimum amount of problems will be the highest score divided by 2
        //add 1 if there are any odd point totals
        for(int a: S){
            if(a%2==1)
                return max/2 + 1;
        }

        return max/2;
    }

}
