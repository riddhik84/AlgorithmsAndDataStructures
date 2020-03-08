/*
* can you re-arrange its elements in such a way that the negative elements appear at one side and positive elements appear at the other? Solve this problem 
* in Java and see if your code runs correctly!
*
* Solution: In-Place rotation
* This can also be solved using additional array. In that case space complexity will be O(n)
*
* Time complexity: O(n)
* Space Complexity: O(1)
*
* author: Riddhi Kakadia
*
*/


public class RearrangePositiveNegative{
	public static void main(String[] args){
		int[] arr = {10, -1, -20, -4, 5, -9, -6, 8};
		reArrange(arr);
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
	
	/* Use two points. Left and Right
	* check values from left and right
	* If the right side value is -ve and left side value is +ve
	* -- swap values
	* -- incement pointers
	*/
	static void reArrange(int[] arr){
		int i = 0;
		int j = arr.length - 1;
		
		while(i < j){ //Use two pointers
			if(arr[i] > 0 && arr[j] < 0){
				//Swap -ve and +ve values. Move +ve to end of the array.
				int tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
				i++;
				j--;
			} else if(arr[i] < 0){
				i++;
			} else if(arr[j] > 0) {
				j--;
			}			
		}		
	}
}