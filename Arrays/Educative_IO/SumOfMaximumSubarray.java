import java.util.Arrays;

public class SumOfMaximumSubarray {
	public static void main(String[] args){
		//Kadane's algorithm solution from educative
		int[] arr = {1, 7, -2, -5, 10, -1};
		System.out.println("Input Array : " + Arrays.toString(arr));
		
		int maxSum = findMaxSum(arr);
		System.out.println("Maximum sub array sum: " + maxSum);
		
	}
	
	public static int findMaxSum(int[] input){
		//Set current max and global max as input[0]
		int currentMax = input[0];
		int globalMax = input[0];
		
		for(int i = 0; i < input.length; i++){
			//if current max is < 0 change current max as input[i]
			if(currentMax < 0){
				currentMax = input[i];
			} else {
				currentMax += input[i];
			}
			
			//if global max is less than current max, make current max as global max
			if(globalMax < currentMax){
				globalMax = currentMax;
			}
		}
		return globalMax;
	}
}