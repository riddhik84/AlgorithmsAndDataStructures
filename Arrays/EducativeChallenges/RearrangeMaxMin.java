/*
*  re-arrange the elements such that the first position will have the largest number, the second will have the smallest, the third will have the second largest, and so on.
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
import java.util.*;

public class RearrangeMaxMin{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7};
		reArrangeMaxMin(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	/* Hide existing element as well as new element at each index of array first and then reveal it.
	* in for loop i is divided by 2 not the value of arr[i]
	* Formula_even = 2 + (7 % 8) * 8;
	* Formula_odd = 2 + (1 % 8) * 8; 
	*/
	static void reArrangeMaxMin(int[] arr){
			int max_element = arr[arr.length - 1] + 1; //Take the max element as maximumg element in the array + 1
			int min_index = 0;
			int max_index = arr.length - 1;
			
			for(int i = 0; i < arr.length; i++){
				if(i % 2 == 0){
					//System.out.println("arr[i] " + arr[i] + " (arr[max_index] " + arr[max_index] + " % max_element " + max_element + ") * max_element");
					arr[i] = arr[i] + (arr[max_index] % max_element) * max_element; //Use this formula to calculate new values. Use max_index for even values.
					//System.out.println("arr[i] " + arr[i]);
					max_index--;
				} else {
					//System.out.println("arr[i] " + arr[i] + " (arr[min_index] " + arr[min_index] + " % max_element " + max_element + ") * max_element");
					arr[i] = arr[i] + (arr[min_index] % max_element) * max_element; //Use min_index for odd values
					//System.out.println("arr[i] " + arr[i]);
					min_index++;
				}
			}
			
			for(int i = 0; i < arr.length; i++){
				arr[i] = arr[i] / max_element;
			}
	}
}