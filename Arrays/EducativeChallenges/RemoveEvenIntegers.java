/*
Implement the int [] removeEven(int[] arr) function which removes all the even elements from the array and returns back updated array.

Solution time complexity: O(n)
*/

public class RemoveEvenIntegers{
	public static void main(String[] args){
		int[] inputArray = {1, 2, 4, 5, 10, 6, 3, 0};
		int[] outputArray = removeEven(inputArray);
		for(int number: outputArray){
			System.out.print(number + " ");
		}
	}
	
	static int[] removeEven(int[] arr){
		int oddNumbers = 0;
		for(int i : arr){
			if(!isEvenNumber(i)){
				oddNumbers++;
			}
		}
		int[] output = new int[oddNumbers];
		int outputCounter = 0;
		
		for(int i : arr){
			if(!isEvenNumber(i)){
				output[outputCounter++] = i;
			}
		}
		return output;
	}
	
	static boolean isEvenNumber(int number){
		boolean result = ((number % 2) == 0) ? true : false;
		return result;
	}
}