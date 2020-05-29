
public class MyStack {
	public static void main(String[] args){
		
		long start = System.nanoTime();
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Empty stack " + stack.size());
		
		stack.push(1);
		System.out.println("Stack size " + stack.size());
		stack.print();
		
		stack.push(2);
		System.out.println("Stack size " + stack.size());
		stack.print();
		
		stack.push(3);
		System.out.println("Stack size " + stack.size());
		stack.print();
		
		System.out.println("Stack first element " + stack.peek());
		
		stack.pop();
		System.out.println("Stack size " + stack.size());
		stack.print();
		
		System.out.println("Stack search " + stack.search(1));
		
		stack.pop();
		System.out.println("Stack size " + stack.size());
		stack.print();
		
		long end = System.nanoTime();
		
		System.out.println("Execution Time: " + (end - start) / 1e9);


	}
}