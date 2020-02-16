/*
* Description: https://www.geeksforgeeks.org/array-rotation/
* Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
* Left rotate the array elements
* 
* @author Riddhi Kakadia
*
*/ 


class ArrayRotation {
	public static void main(String[] args){
		int elements = 4;
		int[] input1 = {1,2,3,4,5,6,7,8,9,10,11,12};
		System.out.println("Input Array: " + Arrays.toString(input1));
		
		rotate(input1, elements);
		System.out.println("Output Rotated array: " + Arrays.toString(input1));
		
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12};
		inplacerotate(input2, elements);
		System.out.println("Output Rotated array: " + Arrays.toString(input2));
		
	}
	
	//Store number of elements in a tmp array of size elements
	//Rotate original array in place with elements positions
	//Copy numbers from tmp array at the end of the original array 
	//
	//Time complexity: O(n)
	//Auxilary space complexity: O(elements)
	//
	static void rotate(int[] array, int elements){
		int[] tmp = new int[elements];
		for(int i = 0; i < elements; i++){
			tmp[i] = array[i];
		}
		
		int i = 0;
		for(; i < array.length - elements; i++){
			array[i] = array[i + elements];
		}
		
		for(int j = 0; i < array.length; i++, j++){
			array[i] = tmp[j];
		}
	}
	
	
	//In place array rotation
	//Divide the array in number of groups equal to elements to be rotated
	//Rotate each group in place within the array 1 by 1
	//-- store the first number of the group in tmp
	//-- rotate the su group
	//-- copy the tmp number to last position of the rotated sub group
	//
	//Time complexity: O(n)
	//Space complexity: O(1)
	//
	static void inplacerotate(int[] array, int elements){
		int start = 0;
		while(start < elements){
			int tmp = array[start];
			int i = start;
			for(; i + elements < array.length; i = i + elements){
				array[i] = array[i + elements];
			}
			array[i] = tmp;
			System.out.println("Array : " + Arrays.toString(array));
			start++;
		}
	}
}