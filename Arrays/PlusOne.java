package com.leetcode.arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] input = {9, 9, 9, 9};
        System.out.println(Arrays.toString(plusOneNumber(input)));
    }

    public static int[] plusOneNumber(int[] array) {
        if (array == null || array.length < 1) {
            return new int[0];
        }

        int carry = 0;
        int addition = array[array.length - 1] + 1;
        if (addition > 9) {
            carry = 1;
            array[array.length - 1] = 0;
            for (int i = array.length - 2; i >= 0; i--) {
                if (carry == 1) {
                    array[i] = array[i] + 1;
                    if (array[i] > 9) {
                        array[i] = 0;
                        carry = 1;
                    } else {
                        carry = 0;
                    }
                }
            }
            if (carry == 1) {
                int[] newArray = new int[array.length + 1];
                newArray[0] = 1;
                for (int i = 1; i < newArray.length; i++) {
                    newArray[i] = array[i - 1];
                }
                return newArray;
            }
            return array;
        }
        array[array.length - 1] = array[array.length - 1] + 1;
        return array;
    }
}
