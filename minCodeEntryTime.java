/**
 * Given a rotary lock which has numbers 1 to N, calculate the minimum time
 * it takes to enter the code define in array C if it takes 1 second to rotate
 * the wheel by 1 unit
 */

public class minCodeEntryTime {

    public long getMinCodeEntryTime(int N, int M, int[] C) {

        long time = 0;
        //given the lock starts at position 1
        int start = 1;

        for(int end: C){
            //for each number in the code calculate the different between them
            int diff = Math.abs(end - start);
            //if the different is less than half of N, add that as the time
            if(diff <= (N/2))
                time += diff;
            //otherwise use N - diff because it would be faster to turn the lock the opposite direction
            else
                time += N - diff;

            //set the new start as the old end position
            start = end;
        }

        return time;
    }

}
