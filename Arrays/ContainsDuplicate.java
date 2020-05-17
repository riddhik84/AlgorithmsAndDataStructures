//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3};
        System.out.println("Array contains duplicate: " + hasDuplicates(array));
        //System.out.println("Array contains duplicate: " + hasDuplicatesFaster(array));
    }

    //Runs faster but contains Arrays sorting built-in function
    public static boolean hasDuplicatesFaster(int[] array) {
        if (array != null && array.length > 0) {
            Arrays.sort(array);
            for (int i = 1; i < array.length; i++) {
                if (array[i] == array[i - 1])
                    return true;
            }
        }
        return false;
    }

    //Using hashset. But do not use contains method. Just check !add. Runs faster without using contains.
    public static boolean hasDuplicates(int[] array) {
        if (array != null && array.length > 0) {
            HashSet<Integer> arraySet = new HashSet<>();
            for (int i = 0; i < array.length; i++) {
                //Do not check contains here. Check if add method return false
                if (!arraySet.add(array[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}
