//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        int steps = 4;
        rotateArrayRight(input, steps);
        System.out.println(Arrays.toString(input));
    }

    public static void rotateArrayRight(int[] array, int steps) {
        if (array != null && array.length > 1 && array.length != steps) {
            if (steps > array.length) {
                steps = steps - array.length;
            }
            // reverse the input array
            arrayReverse(array, 0, array.length - 1);
            arrayReverse(array, 0, steps - 1);
            arrayReverse(array, steps, array.length - 1);
        }
    }

    public static void arrayReverse(int[] array, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
}
