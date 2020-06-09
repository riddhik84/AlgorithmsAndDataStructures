//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/

import java.util.Arrays;

public class RemoveDuplicatesInPlace {
    public static void main(String[] args) {
        int[] input = {0,0,1,1,1,2,2,3,3,4};
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
    
    //161 / 161 test cases passed.
    //Status: Accepted
    //Runtime: 0 ms
    //Memory Usage: 41.5 MB
    public int removeDuplicates_updated(int[] nums) {
        int location = 1;

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int prev = nums[i - 1];

            if (current != prev) {
                nums[location] = current;
                location++;
            }
        }
        return location;
        
    }
}
