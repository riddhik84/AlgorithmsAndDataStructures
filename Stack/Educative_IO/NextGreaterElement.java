import java.util.*;

public class NextGreaterElement {
	public static void main(String[] args){
		int[] arr = {4,6,3,2,8,1};
		System.out.println(Arrays.toString(arr));
		
		arr = nextGreaterElement(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static int[] nextGreaterElement(int[] arr){
		int[] result = new int[arr.length];
        int resultIndex = 0;
        java.util.Stack<Integer> stack = new java.util.Stack<>();
		
        //iterate for rest of the elements - start from the end
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
			
            if(stack.isEmpty()){
                result[i] = -1;
            } else {
                result[i]  = stack.peek();
			}
			
            stack.push(arr[i]);
        }
        return result;
	}
}