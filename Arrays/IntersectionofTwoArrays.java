//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {4, 9, 5};
        int[] array2 = {9, 4, 9, 8, 4};
        int[] intersection = intersectionOfArrays(array1, array2);
        System.out.println(Arrays.toString(intersection));
    }

    //Check intersection - meaning similar numbers (with count) in both arrays
    public static int[] intersectionOfArrays(int[] array1, int[] array2) {
        if (array1 == null || array2 == null || array1.length == 0 || array2.length == 0) {
            return new int[0];
        }

        //Sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);
        int i = 0;
        int j = 0;
        ArrayList<Integer> output = new ArrayList<>();

        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                output.add(array1[i]);
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] intersection = new int[output.size()];
        int k = 0;
        for (int n : output) {
            intersection[k] = n;
            k++;
        }
        return intersection;
    }
}
