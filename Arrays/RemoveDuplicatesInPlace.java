//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/

import java.util.Arrays;

public class RemoveDuplicatesInPlace {
    public static void main(String[] args) {
        int[] input = null;
        System.out.println("Unique values length : " + uniqueLength(input));
        System.out.println(Arrays.toString(input));
    }

    static int uniqueLength(int[] input) {
        int newArrayLen = 0;
        if (input != null && input.length > 0) {
            newArrayLen = 1;
            int current = input[0];
            for (int i = 1; i < input.length; i++) {
                if (input[i] != current) {
                    input[newArrayLen++] = input[i];
                }
                current = input[i];
            }
        }
        return newArrayLen;
    }
}
