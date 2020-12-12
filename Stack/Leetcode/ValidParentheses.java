import java.util.*;

public class ValidParentheses {
	public static void main(String[] args){
		String[] parantheses = {"{}[]()", "(((())))", "(){}]"};
		for (String s : parantheses){
			System.out.println(isValid(s));
		}
	}
	
	
    public static boolean isValid(String s) {        
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            switch(current){
                case '}':
                    if(stack.size() == 0 || stack.pop() != '{')
                        return false;
                    break;
                case ']':
                    if(stack.size() == 0 || stack.pop() != '[')
                        return false;
                    break;
                case ')':
                    if(stack.size() == 0 || stack.pop() != '(')
                        return false;
                    break;  
                default:
                    stack.push(current);
            }
        }
        
        return stack.isEmpty(); 
    }
}