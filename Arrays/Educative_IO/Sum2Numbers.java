import java.util.Arrays;
import java.util.HashMap;

public class Sum2Numbers {
	
	public static void main(String[] args){
		int[] arr = {2, 4, 5, 7, 8};
		int n = 9;
		
		int[] result = new int[2];
		findSum(arr, n, result);
		
		System.out.println(Arrays.toString(result));
	}
	
	public static void findSum(int[] input, int sum, int[] result){
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i : input){
			
			if(map.containsKey(i)){
				System.out.println(i);
				result[0] = sum - i;
				result[1] = i;
			}
			map.put(sum-i, i);
		}
	}
}