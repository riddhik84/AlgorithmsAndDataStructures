
/*
Best time complexity: Ω(n log(n))	
Average time complexity: Θ(n log(n))	
Worst time complexity: O(n^2)
Space complexity: O(log(n))

Divide and Conquer algorithm

There are many different versions of quickSort that pick pivot in different ways.

Always pick first element as pivot.
Always pick last element as pivot (implemented below)
Pick a random element as pivot.
Pick median as pivot.

parition() function is main function of this algo.
*/

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args){
		int[] input = {30, 80, 10, 90, 40, 50, 70, 20, 100, 60};
		int low = 0;
		int high = input.length - 1;
		quickSort(input, low, high);
		System.out.println(Arrays.toString(input));
	}
	
	//Quick sort recursion call
	public static void quickSort(int[] array, int low, int high){		
		if (low < high){
			int partitioning_index = partition(array, low, high);
			
			// Recursively sort elements before partition and after partition 
			// Consider pi - 1 and pi + 1 as boundry
			quickSort(array, low, partitioning_index - 1);
			quickSort(array, partitioning_index + 1, high);
		}
	}
		
	//Selecting high as pivot
	public static int partition(int[] array, int low, int high){
		int pivot = array[high];
		int i = low - 1;
		
		for(int j = low; j < high; j++){
			if(array[j] < pivot){
				//swap array[j] and value at position i++
				i++;
				
				int tmp = array[j];
				array[j] = array[i];
				array[i] = tmp;
			}
		}
			
		// swap array[i+1] and pivot - move pivot to right position
		int temp = array[i+1]; 
		array[i+1] = array[high]; 
		array[high] = temp; 
		
		System.out.println(Arrays.toString(array));
  
        return i+1; 
	}
}
