import java.util.*;

public class NAndItsDoubleExist {
	public static void main(String[] args){
		int[] input1 = {10,2,5,3};
		System.out.println("Result: " + checkIfExist(input1));
		System.out.println();
		
		int[] input2 = {7,1,14,11};
		System.out.println("Result: " + checkIfExist(input2));
		System.out.println();

		int[] input3 = {3,1,7,11};
		System.out.println("Result: " + checkIfExist(input3));
				System.out.println();

		int[] input4 = {3,1,7,11};
		System.out.println("Result: " + checkIfExist(input4));
				System.out.println();

		int[] input5 = {-2,0,10,-19,4,6,-8};
		System.out.println("Result: " + checkIfExist(input5));
				System.out.println();
				
		int[] input6 = {0, 0};
		System.out.println("Result: " + checkIfExist(input6));
				System.out.println();

	}
	
	//104 / 104 test cases passed.
	//Status: Accepted
	//Runtime: 1 ms
	//Memory Usage: 38.8 MB
    static public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
		for (Integer n : arr) {
			//Check for n/2 only when n%2 == 0 otherwise the algo fails
			if (set.contains(n * 2) || (n % 2 == 0 && set.contains(n / 2))) {
				return true;
			}
			set.add(n);
		}
		return false;
    }
}