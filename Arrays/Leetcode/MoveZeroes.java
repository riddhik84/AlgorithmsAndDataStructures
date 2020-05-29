//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] input = {0, 0, 1};
        //{1,1,0,0,2}
        moveZeroes(input);
        System.out.println(Arrays.toString(input));
    }

    public static void moveZeroes(int[] nums) {
        if (nums.length != 1) {
            int idx0;
            int idx1 = 0;
            for (int i = 0; i < nums.length; i++) {
                idx0 = i;
                while (idx0 < nums.length - 1 && nums[idx0] != 0) {
                    idx0 = idx0 + 1;
                }
                idx1 = idx0 + 1;
                while (idx1 < nums.length - 1 && nums[idx1] == 0) {
                    idx1 = idx1 + 1;
                } // find non 0's position

                //Swap numbers
                if (idx1 < nums.length && idx0 < nums.length) {
                    int tmp = nums[idx0];
                    nums[idx0] = nums[idx1];
                    nums[idx1] = tmp;
                }
                //System.out.println(Arrays.toString(nums));
            }
        }
    }

    public static void moveZeroes_(int[] nums) {

    }
}
