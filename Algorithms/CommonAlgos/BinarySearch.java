/*
- works only on sorted array
- Time complexity - O(logN)
*/
public class BinarySearch {
	public static void main(String[] args){
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int k;
		
		//linear algorithm
		k = 8;
		boolean result = binarySearchLinear(numbers, k);
		System.out.println("Found " + k + " " + result); //true
		
		k = 11;
		result = binarySearchLinear(numbers, k);
		System.out.println("Found " + k + " " + result); //false
		
		//Recursive algorithm
		k = 8;
		result = binarySearchRecursive(numbers, k);
		System.out.println("Found " + k + " " + result); //true
		
		k = 11;
		result = binarySearchRecursive(numbers, k);
		System.out.println("Found " + k + " " + result); //false
	}
	
	static boolean binarySearchLinear(int[] nums, int k){
		int left = 0;
		int right = nums.length - 1;
		
		while(left <= right){
			int mid = (left + right)/2;
			
			if(nums[mid] < k){
				left = mid + 1; //ignore left sub array
			} else if(nums[mid] > k ){
				right = mid - 1; //ignore right sub array
			} else {
				return true; //mid is k
			}
		}
		return false; //number not found
	}
	
	
	static boolean binarySearchRecursive(int[] nums, int k){
		int left = 0;
		int right = nums.length - 1;
		
		return binarySearch(nums, k, left, right);
	}
	static boolean binarySearch(int[] nums, int k, int left, int right){
		
		if(left <= right){		
			int mid = (left + right) / 2;
				
			if(nums[mid] < k){
				return binarySearch(nums, k, mid+1, right);
			} else if(nums[mid] > k){
				return binarySearch(nums, k, left, mid-1);
			} else {
				return true;
			}
		}
		return false;
	}
}