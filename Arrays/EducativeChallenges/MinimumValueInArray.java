/*
you have to implement the int findMinimum(int[] arr) function which will traverse the whole array and find the smallest number in the array.

Time complexity = O(n)
*/

public class MinimumValueInArray {
	public static void main(String[] args){
		int[] arr = {-200, 2, 3, 6, 0, -100};
		int output = findMinimum(arr);
		System.out.println("Minimum value: " + output);
	}
	
	static int findMinimum(int[] arr){
		int min_value = arr[0]; //minimum value set as first value in array
		for(int i : arr){
			if(i < min_value){
				min_value = i;
			}
		}
		return min_value;
	}
}