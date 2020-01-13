/*
Given an array, can you rotate its elements once from right to left? Implement your solution in Java and see if your code runs successfully!

Time complexity: O(n)
*/


public class RightRotateArrayOneIndex{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		rotateArray(arr);
		for(int i : arr){
			System.out.print(i + " ");
		}
	
	}
	
	static void rotateArray(int[] arr){
		int last = arr[arr.length -1];
		
		for(int i = arr.length - 1; i > 0; i--){
				arr[i] = arr[i - 1];
		}
		arr[0] = last;
	}

}