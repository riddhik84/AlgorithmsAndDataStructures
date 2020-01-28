/*
* Reverse first K elements of a Queue
*
* @author Riddhi Kakadia
*
* Time Complexity: 
*/

import java.util.Stack;

public class ReverseFirstKQueue {
	public static void main(String[] args){
		Queue<Integer> input = new Queue<Integer>();
		for(int i = 1; i <= 10; i++){
			input.enqueue(i);
		}
		input.print();
		int k = 5; // reverse first k values
		
		reverseQueue(input, k);
	}
	
	static void reverseQueue(Queue<Integer> queue, int k){
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < k; i++){
			stack.push(queue.dequeue());
		}
		queue.print();
		
		for(int i = 0; i < k; i++){
			//System.out.println(i);
			queue.enqueue(stack.pop());
		}
		queue.print();
		
		for(int i = 0; i < k; i++){
			int val = queue.dequeue();
			queue.enqueue(val);
		}
		queue.print();
	}
}