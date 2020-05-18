//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/

import java.util.Arrays;

public class BuySellStockII {
    public static void main(String[] args) {
        int[] input1 = {7, 1, 5, 3, 6, 4};
        int[] input2 = {1, 2, 3, 4, 5};
        int[] input3 = {7, 6, 4, 3, 1};

        int profit = findProfit(input3);
        System.out.println(profit);
    }

    public static int findProfit(int[] input) {
        int profit = 0;
        for (int i = 1; i < input.length; i++) {
            if (input[i] > input[i - 1]) {
                profit = profit + (input[i] - input[i - 1]);
            }
        }
        return profit;
    }
}
