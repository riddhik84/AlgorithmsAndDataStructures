/*
Given an array of size n, can you find the second maximum element in the array? Implement your solution in Java and see if your output matches the correct output!

Time Complexity = O(n)
*/

public class SecondMaximumValue{
	public static void main(String[] args){
		int[] arr = {14,2,3,6,7,10,9,11,12,15};
		int output = findSecondMaximum(arr);
		System.out.println("Second maximum value: " + output);
		
	}
	
	static int findSecondMaximum(int[] arr){
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++){
			if(max < arr[i]){
				secondmax = max;
				max = arr[i];
			} else if(arr[i] > secondmax && arr[i] != max){
				//If the current element is greater than the secondmax but less than max, then update secondmax to store the value of the current element
				secondmax = arr[i];
			}
		}
		return secondmax;
	}
}