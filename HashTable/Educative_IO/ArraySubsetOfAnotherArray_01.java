
import java.util.*;

public class ArraySubsetOfAnotherArray_01 {
	public static void main(String[] args){
		int[] arr1 = {4,6,2,12,45,78,3,4,89,34,5,7};
		int[] arr2 = {78,6,7};
		
		boolean result = findSubset(arr1, arr2);
		System.out.println("Is subset ? " + result);
	}
	
	public static boolean findSubset(int[] arr1, int[] arr2){
		HashSet<Integer> set = new HashSet<>();
		
		//add all elements of arr1 in set
		for(int i : arr1){
			set.add(i);
		}
		//check all elements of arr2 in set
		for(int i : arr2){	
			if(!set.contains(i)){
				return false;
			}
		}
		return true;
	}
}