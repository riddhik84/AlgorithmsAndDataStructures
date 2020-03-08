/*
* Implement the int [] removeEven(int[] arr) function which removes all the even elements from the array and returns back updated array.
* Implement the In-Place solution
*
* Solution time complexity: O(n)
*
* @author Riddhi Kakadia
*
*/

import java.util.*;

public class RemoveEvenIntegersInPlace{
	public static void main(String[] args){
		int[] inputArray = {1, 2, 4, 5, 10, 6, 3, 0};
		System.out.println(Arrays.toString(inputArray));
		
		//int[] inputArray = {1, 1, 1, 1};
		int[] outputArray = removeEvenIntInPlace(inputArray);
		
		System.out.println(Arrays.toString(outputArray));
	}
	
	/* Start checking for even number from left (i)
	* If i is even, loop thru last element (j) till the last odd number is found
	* once last odd number j is found, swap i and j values
	* do j-- after swap
	* do i++ to check every element
	* main condition is i < j
	*/
	static int[] removeEvenIntInPlace(int[] input){
		int i = 0;
		int j = input.length - 1;
		while(i < j){
			if(isEvenNumber(input[i])){
				while(isEvenNumber(input[j])){
					j--;
				}
				int tmp = input[i];
				input[i] = input[j];
				input[j] = tmp;
				j--;
			}
			i++;
		}
		//Return copy of array from 0 to last odd element (do +1 to include last value)
		return Arrays.copyOfRange(input, 0, j+1);
	}
	
	static boolean isEvenNumber(int number){
		return ((number % 2) == 0) ? true : false;
	}
}