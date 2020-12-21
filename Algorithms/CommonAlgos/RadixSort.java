import java.util.Arrays;

//Best case time complexity: Ω(nk)	
//Average case time complexity: Θ(nk)	
//Worst case time complexity: O(nk)
//Worst case space complexity: O(n+k)

public class RadixSort {
	
	public static void main(String[] args){
		int[] input_array = {170, 45, 75, 90, 802, 24, 2, 66};
		radix_sort(input_array);
		System.out.println(Arrays.toString(input_array));
	}
	
	//Radix sort
	public static void radix_sort(int[] array){
		//find the maximum number to count max number of digits
		int max = getMax(array);
		
		//counting sort for each number
		for (int exp = 1; max / exp > 0; exp *= 10) 
            countSort(array, exp); 
	}
	
	//Counting sort
	public static void countSort(int[] array, int exp){
		System.out.println("exp: " + exp);
		
		int len = array.length;
		int[] output = new int[len];
		
		//Array from 0 to 9
		int[] count = new int[10]; 
		Arrays.fill(count, 0);
		
		int i = 0;
		
		//Count number of digits at each exp
		for(i = 0; i < len; i++){
			count[(array[i] / exp) % 10]++;
		}
		
		//add total of current and last counts to each position
		for (i = 1; i < 10; i++){ 
            count[i] += count[i - 1];
		}
		
		// Build the output array 
        for (i = len - 1; i >= 0; i--) { 
            output[count[(array[i] / exp) % 10] - 1] = array[i]; 
            count[(array[i] / exp) % 10]--; 
        }
		
		//move results of output array into original array
		for (i = 0; i < len; i++){ 
            array[i] = output[i]; 
		}
		System.out.println(Arrays.toString(array));

	}
	
	//Utility function to find max value in the array
	public static int getMax(int[] array){
		int max_value = Integer.MIN_VALUE;
		
		if(array.length != 0){
			for(int n : array){
				if(n > max_value){
					max_value = n;
				}
			}
		}
		return max_value;
	}
}

