/*
Given two sorted arrays, you have to implement the int[] mergeArrays(int[] arr1, int[] arr2) function which returns an array consisting of all elements of both arrays in a sorted way.

Solution time complexity = O(n+m)
*/

public class MergeTwoSortedArrays {
	public static void main(String[] args){
		int[] arr1 = {1, 3, 4, 5, 9, 10};
		int[] arr2 = {1, 2, 6, 7, 8};
		int[] output = mergeArrays(arr1, arr2);
		for(int i : output){
			System.out.print(i + " ");
		}
	}
	
	static int[] mergeArrays(int[] arr1, int[] arr2){
		int[] output = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < arr1.length && j < arr2.length){
			if(arr1[i] < arr2[j]){
				output[k++] = arr1[i++];
			} else if(arr2[j] < arr1[i]){
				output[k++] = arr2[j++];
			} else {
				output[k++] = arr1[i++];
				output[k++] = arr2[j++];
			}
		}
		
		while(i < arr1.length){
			output[k++] = arr1[i++];
		}
		
		while(j < arr2.length){
			output[k++] = arr2[j++];
		}
		
		return output;
	}
}