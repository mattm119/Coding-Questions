import java.util.HashMap;
import java.util.Map;

/**
 * Returns the most common character (not including space) in a string
 * Assumes all lowercase, no special characters
 * Can return multiple letters if they all share the maximum frequency
 */


public class mostFrequentCharacter {

    public static void main(String[] args) {
        String s = "which is the most common character in this string"; //test string
        int max = 0; //variable to store the max frequency count of a character
        Map<Character, Integer> map = new HashMap<Character, Integer>(); //map to link characters to amount of occurrences

        //loop through the string adding characters to the map
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != ' ') {
                if (!map.containsKey(c))
                    map.put(c, 1);
                else
                    map.put(c, map.get(c) + 1);
            }
        }

        System.out.println("Char \t # of occurrences\n-----------------------");

        //loop through the map to find the highest frequency
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > max)
                max = entry.getValue();
             System.out.println(entry.getKey() + "\t\t " + entry.getValue());
        }

        System.out.println();

        //loop through the map to print all character with max number of frequency
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == max)
            System.out.println(entry.getKey() + " is the most common letter");
        }
    }
}
