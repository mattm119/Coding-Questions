import java.util.LinkedHashSet;
import java.util.Set;

/**
 * There are N dishes in a row on a food conveyor belt
 * Array D represents the type of food
 * You will only eat the food that you have not eaten the previous K times
 *
 * Determine the maximum amount of food you will eat.
 */

public class maxFoodEaten {

    public int getMaximumEatenDishCount(int N, int[] D, int K) {
        int count = 0;
        Set<Integer> previousFood = new LinkedHashSet<>(); //use a set to store previously eaten food

        //for each food, check if it has been previously eaten
        for (int dishType : D) {
            //if it has been eaten, continue without counting
            if (previousFood.contains(dishType)) {
                continue;
            }

            //otherwise, eat the food and add it to previously eaten food set
            previousFood.add(dishType);
            count++;

            //if the set is larger than K, remove the earliest food from the list
            if (previousFood.size() > K) {
                int earliestEaten = previousFood.iterator().next();
                previousFood.remove(earliestEaten);
            }
        }

        return count;
    }

}
