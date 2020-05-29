/*
* Compute postfix mathematical expressions using stacks!
*
* @author Riddhi Kakadia
*
* Time Complexity: O(n)
*/

import java.util.Stack;

class EvaluatePostfix {
	public static void main(String[] args){
		String input = "921*-8-5+";
		System.out.println("Expression outout : " + evaluatePostFix(input));
	}
	
    public static int evaluatePostFix(String expression) {
		//pick characters 1 by 1 from the input string - expression
		//add the character in a stack if it is a number
		//If the character is operator (* - + /) and if the stack is not empty
		//    -- pop 2 numbers from the stack
		//    -- perform the operation on the numbers
		//    -- push the result of the operation back to stack
		//Perform above till the end of the last character in the expression
		
		
		int a = 0;
		int b = 0;
		int exp = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < expression.length(); i++){
			char ch = expression.charAt(i);
			if (ch == '*' && stack.size() > 1){
				b = stack.pop();
				a = stack.pop();
				exp = mul(a, b);
				stack.push(exp);
			} else if(ch == '-' && stack.size() > 1){
				b = stack.pop();
				a = stack.pop();
				exp = sub(a, b);
				stack.push(exp);
			} else if(ch == '+' && stack.size() > 1){
				b = stack.pop();
				a = stack.pop();
				exp = add(a, b);
				stack.push(exp);
			} else if(ch == '/' && stack.size() > 1){
				b = stack.pop();
				a = stack.pop();
				exp = div(a, b);
				stack.push(exp);
			} else {
				stack.push(Integer.parseInt(String.valueOf(ch)));
			}
		}
        return exp;
    }
	
	static int mul(int a, int b){
		return a * b;
	}
	
	static int sub(int a, int b){
		return a - b;
	}
	
	static int add(int a, int b){
		return a + b;
	}
	
	static int div(int a, int b){
		return a / b;
	}
}