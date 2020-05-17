//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] array = {3, 1, 1, 2, 2};
        //System.out.println("Single Number is : " + singleNumber(array));

        System.out.println("Single Number is : " + singleNumberFaster(array));
    }

    public static int singleNumber(int[] array) {
        Arrays.sort(array);
        for (int i = 1; i < array.length; i = i + 2) {
            if (array[i - 1] != array[i]) {
                return array[i - 1];
            }
            //System.out.println(i);
        }
        return array[array.length - 1];
    }

    /*
    * Faster solution. Use Java Bitwise XOR. It will make same number value as 0. and at the end only single value will remain.
    * Bitwise XOR (exclusive or) "^" is an operator in Java that provides the answer '1' if both of the bits in its operands are
    different, if both of the bits are same then the XOR operator gives the result '0'. XOR is a binary operator that is
    evaluated from left to right.
    * The operator "^" is undefined for the argument of type String.
    */
    public static int singleNumberFaster(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
            System.out.println("res: " + res);
        }
        return res;
    }
}
