import java.util.*;

/**
 * Assuming two lines of input
 * The first line contains an integer n denoting length of the array
 * The second line contains n integers separated by spaces to be placed in the array
 *
 * The objective is to print the number of subarrays that have a negative sum
 */


public class negativeSubArray {

    public static void main(String[] args) {
        //initialize scanner from system.in and some variables
        Scanner scan = new Scanner(System.in);
        int sum;
        int count = 0;

        //get the first int and set the array size
        int size = scan.nextInt();
        int[] array = new int[size];

        //read through the input populating the array
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }

        //check each subarray for negative sum and increment the counter
        for(int i = 0; i < size; i++){
            sum = 0;
            for(int j = i; j < size; j++){
                sum += array[j];
                if(sum < 0)
                    count++;
            }
        }

        //print the solution
        System.out.println(count);
    }
}