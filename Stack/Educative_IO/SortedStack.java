import java.util.*;

public class SortedStack {
	public static void main(String[] args){
		int[] input = {23,60,12,42,4,97,2};
		
		java.util.Stack<Integer> stack = new java.util.Stack<>();
		for(int i : input){
			stack.push(i);
		}
		
		sortedStack(stack);
		
	}
	
	//using a auxiliary stack
	public static void sortedStack(java.util.Stack<Integer> input){
		//tmp stack to hold sorted stack
		java.util.Stack<Integer> tmpStack = new java.util.Stack<>();
		
		//
		while(!input.isEmpty()){
			int tmp = input.pop();
			
			//check if tmpstack's last value is greater than tmp
			//While peek value from tmpstack is greater than tmp, pop it and push it to input stack
			//then push the tmp value in tmpStack
			
			while(!tmpStack.isEmpty() && tmpStack.peek() > tmp){
				input.push(tmpStack.pop());
			}
			tmpStack.push(tmp);
		}
		
		System.out.println(tmpStack);
	}
}

