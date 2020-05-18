//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int sum = 9;
        int[] numbers = findTwoSum(array, sum);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] findTwoSum(int[] array, int sum) {
        if (array == null || array.length < 2) {
            return new int[]{0, 0};
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                return new int[]{map.get(array[i]), i};
            }
            int number = sum - array[i];
            map.put(number, i);
        }
        return new int[]{0, 0};
    }
}
