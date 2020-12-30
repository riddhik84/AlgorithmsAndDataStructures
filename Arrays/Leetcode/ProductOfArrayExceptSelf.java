import java.util.*;

public class ProductOfArrayExceptSelf {
	public static void main(String[] args){
		int[] arr = {1,2,3,4};
		int[] result = productExceptSelf(arr);
		System.out.println(Arrays.toString(result));

	}
	
    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        
        left[0] = 1;
        right[right.length - 1] = 1;
        
        //left array
        for(int i = 1; i < nums.length; i++){
            left[i] = nums[i-1] * left[i-1]; 
        }
        System.out.println(Arrays.toString(left));
        
        //right array
        for(int j = nums.length - 2; j >= 0; j--){
            right[j] = right[j+1] * nums[j+1];
        }
        System.out.println(Arrays.toString(right));
        
        int[] product_array = new int[nums.length];
        for(int k = 0; k < product_array.length; k++){
            product_array[k] = left[k] * right[k];
        }
        System.out.println(Arrays.toString(product_array));
        
        return product_array;
    }
}