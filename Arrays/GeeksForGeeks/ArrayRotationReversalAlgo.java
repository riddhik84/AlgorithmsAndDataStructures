/*
* Description: https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
* Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
* Left rotate the array elements
* Use Array Reversal Algorithm
*
* @author Riddhi Kakadia
*
*/ 

import java.util.Arrays;

class ArrayRotationReversalAlgo {
	public static void main(String[] args){
		int elements = 2;
		int[] input1 = {1,2,3,4,5,6,7};
		System.out.println("Input Array: " + Arrays.toString(input1));
		
		rotateLeft(input1, elements);
		System.out.println("Output Rotated array: " + Arrays.toString(input1));
		
	}
	
	//Let the array be arr[] = [1, 2, 3, 4, 5, 6, 7], d =2 and n = 7
	//A = [1, 2] and B = [3, 4, 5, 6, 7]
	//Reverse A, we get ArB = [2, 1, 3, 4, 5, 6, 7]
	//Reverse B, we get ArBr = [2, 1, 7, 6, 5, 4, 3]
	//Reverse all, we get (ArBr)r = [3, 4, 5, 6, 7, 1, 2]
	//
	//Time complexity: O(n)
	//Space complexity: O(1)
	//
	static void rotateLeft(int[] array, int elements){
		reverse(array, 0, elements - 1);
		reverse(array, elements, array.length - 1);
		reverse(array, 0, array.length - 1);
	}
	
	static void reverse(int[] array, int start, int end){		
		while(start < end){
			int tmp = array[start];
			array[start] = array[end];
			array[end] = tmp;
			start++;
			end--;
		}
	}
}