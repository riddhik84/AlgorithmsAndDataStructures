class Solution {
    //efficient solution - 0ms in leetcode
    public int[] twoSum(int[] numbers, int target) {
        //two pointers solution
        //do sum or first and last elements of numbers
        //if sum is > target decrement right side element (higher value)
        //else if sum is < target increment left side element (lower value)
        int i = 0;
        int j = numbers.length - 1;
        int sum = 0;
        int[] output = new int[2];
        
        sum = numbers[i] + numbers[j];
        while(i < j && sum != target){ //condition
            if(sum < target){
                i++;
            } else if(sum > target){
                j--;
            }
            sum = numbers[i] + numbers[j];
        }
        
        //need to increment this because of leetcode constraint
        output[0] = ++i; 
        output[1] = ++j;
        
        return output;
    }
}
