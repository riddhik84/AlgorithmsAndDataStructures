import java.util.*;

public class ReverseFirstKQueueJava {
	
	public static void main(String[] args){
		java.util.Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= 10; i++){
			queue.add(i);
		}
		System.out.println(queue);
		
		int K = 5;
		
		reverseK(queue, K);
	}
	
	public static void reverseK(java.util.Queue queue, int K){
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < K; i++){
			stack.push((Integer)queue.poll());
		}
		
		for(int i = 0; i < K; i++){
			queue.add(stack.pop());
		}
		
		for(int i = 0; i < queue.size() - K; i++){
			queue.add(queue.poll());
		}
		
		System.out.println(queue);
	}
	
}