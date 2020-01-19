/*
Implement the int[] findSum(int[] arr, int n) function which will take a number n and an array arr as an input and returns two integers that add up to n in an array.
*/
import java.util.*;

public class TwoNumbersAddToN{
	public static void main(String[] args){
		int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
		int value = 27;
		
		//Brute Force solution
		int[] output1 = findSum_bruteforce(arr, value);
		printOutput(output1);
		
		//Sort the array and use double pointer to traverse the arrays
		int[] output2 = findSum_sortarray(arr, value);
		printOutput(output2);
		
		//Input all values of the array in a HashSet 
		int[] output3 = findSum_hashset(arr, value);
		printOutput(output3);
		
	}
	
	//Time complexity = O(n2)
	static int[] findSum_bruteforce(int[] arr, int n){
		int[] output = new int[2];	

		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] + arr[j] == n){
					output[0] = arr[i];
					output[1] = arr[j];
					break;
				}
			}
		}	
		return output;
	}
	
	//Time complexity = O(nlogn)
	static int[] findSum_sortarray(int[] arr, int n){
		int[] output = new int[2];	
		Arrays.sort(arr); //sort array

		for(int i = 0, j = arr.length - 1; i < j;){
			
			if((arr[i] + arr[j]) < n){
				i++;
			} else if ((arr[i] + arr[j]) > n){
				j--;
			} else {
				output[0] = arr[i];
				output[1] = arr[j];
				break;
			}
		}	
		return output;
	}
	
	//Time complexity = O(n)
	static int[] findSum_hashset(int[] arr, int n){
		int[] output = new int[2];
		Set<Integer> inputSet = new HashSet<Integer>();

		for(int i : arr){
			if(inputSet.contains(n - i)){
				output[0] = i;
				output[1] = n - i;
				break;
			}
			inputSet.add(i);
		}
		return output;
	}
	
	static void printOutput(int[] input){
		for(int i : input){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}