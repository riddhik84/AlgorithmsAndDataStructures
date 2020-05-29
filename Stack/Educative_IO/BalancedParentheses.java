/*
* Check if its parentheses are balanced
*
* @author Riddhi Kakadia
*
* Time Complexity: O(n)
*/

import java.util.Stack;

public class BalancedParentheses {
	public static void main(String[] args){
		String input = "[{}]";
		System.out.println("Is balanced? " + input + " " + isBalanced(input));
	}
	
	static boolean isBalanced(String exp){
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < exp.length(); i++){
			char parentheses = exp.charAt(i);
			System.out.println(parentheses);
			
			if (parentheses == '}' || parentheses == ']' || parentheses == ')'){
				
				if(stack == null || stack.size() == 0){
					return false;
				}
				int current = stack.pop();
				if((parentheses == '{' && current != '}') || (parentheses == '[' && current != ']') || (parentheses == '(' && current != ')')){
					return false;
				}
			}
			else {
				stack.push(parentheses);
			}
		}
		if (!stack.isEmpty()) return false; //Important to add this condition
		
		return true;
	}
}