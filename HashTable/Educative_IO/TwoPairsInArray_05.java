//output: {4,12}{7,9}

import java.util.*;

public class TwoPairsInArray_05 {
	
	public static void main(String[] args){
		int[] arr = {3, 4, 7, 1, 12, 9};
		findPair(arr);
	}
	
	public static void findPair(int[] arr){
		HashMap<Integer, String> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++){
			for(int j = i + 1; j < arr.length; j++){
				int sum = arr[i] + arr[j];
				
				if(map.containsKey(sum)){
					System.out.println(map.get(sum) + "{" + arr[i] + "," + arr[j] + "}");
					return;
				} else {
					String value = "{" + arr[i] + "," + arr[j] + "}";
					map.put(sum, value);
				}
			}
		}
		System.out.println("No match found");
	}
}