import java.util.Arrays;

//Best case time complexity: Ω(n+k)		
//Average case time complexity: Θ(n+k)	
//Worst case time complexity: O(n+k)
//Worst case space complexity: O(k)

public class CountingSort {
	public static void main(String[] args){
		int[] input = {4,2,2,8,3,3,1};
		System.out.println(Arrays.toString(input));
		
		countingSort(input);
		System.out.println(Arrays.toString(input));
	}
	
	public static void countingSort(int[] array){
		//create array to store output values
		int[] output = new int[array.length + 1];
		
		//find max value
		int max_value = Integer.MIN_VALUE;
		for(int i : array){
			if(max_value < i){
				max_value = i;
			}
		}
		//create count array
		int[] count = new int[max_value + 1];
		
		//count each number's occurance
		for(int i = 0; i < array.length; i++){
			count[array[i]]++; 
		}
		System.out.println(Arrays.toString(count));
		
		//cumulative counts
		for(int i = 1; i < count.length; i++){
			count[i] += count[i-1];
		}
		System.out.println(Arrays.toString(count));
		
		//sorted output array
		for (int i = array.length - 1; i >= 0; i--) {
			output[count[array[i]] - 1] = array[i];
			count[array[i]]--;
		}
		System.out.println(Arrays.toString(output));
		
		//copy all values from output to array
		for(int i = 0; i < array.length; i++){
			array[i] = output[i];
		}
	}
}
