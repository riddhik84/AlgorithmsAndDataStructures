/*
Given an array, return an array where each index stores the product of all numbers except the number on the index itself. Implement your solution in Java and see if your output matches the expected output!
*/
public class ArrayOfProductsOfAllElementsExceptItself{
	public static void main(String[] args){
		//Case without zero
		int[] arr1 = {1,2,3,4};
		int[] output1 = findProduct(arr1);
		int[] output11 = findProduct_sol2(arr1);
		printArray(output1);
		printArray(output11);
		System.out.println();
		
		//Case with 1 zero
		int[] arr2 = {1,2,3,4,0};
		int[] output2 = findProduct(arr2);
		int[] output22 = findProduct_sol2(arr2);
		printArray(output2);
		printArray(output22);
		System.out.println();
		
		//Case with 2 zeros
		int[] arr3 = {1,2,3,4,0,0};
		int[] output3 = findProduct(arr3);
		int[] output33 = findProduct_sol2(arr3);
		printArray(output3);
		printArray(output33);
		System.out.println();
		
	}
	
	//Educative solution
	//Time complexity = O(n)
	//Space complexity = O(1)
	static int[] findProduct(int[] arr){
		int[] output = new int[arr.length];
		int tmp = 1;
		
		//Initialize output array with 1
		for(int i = 0; i < output.length; i++){
			output[i] = 1;
		}
		//multiplication of all elements on left side except the current element
		for(int i = 0; i < arr.length; i++){
			output[i] = tmp;
			tmp = tmp * arr[i];
		}
		//printArray(output);

		//reset tmp
		tmp = 1;
		
		//Multiplication of all elements of right side with the output array
		for(int i = arr.length -1 ; i >= 0; i--){
			output[i] = output[i] * tmp;
			tmp = tmp * arr[i];
		}
		//printArray(output);
					
		return output;
	}
	
	//Better solution to understand
	//Time complexity = O(n)
	//Space complexity = O(n)
	static int[] findProduct_sol2(int[] arr){
		int[] output = new int[arr.length];
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		
		//Initilize both arrays
		left[0] = 1;
		right[arr.length - 1] = 1;
		
		//build left elements array
		for(int i = 1; i < left.length; i++){
			left[i] = arr[i-1] * left[i-1];
		}
		
		//build right element array
		for(int i = right.length - 2; i >=0 ; i--){
			right[i] = arr[i+1] * right[i+1];
		}
		
		//build output array (multiply left and right)
		for(int i = 0; i < output.length ; i++){
			output[i] = left[i] * right[i];
		}					
		return output;
	}
	
	static void printArray(int[] input){
		for(int i : input){
			System.out.print(i + " ");
		}
		System.out.println();
	}

}