import java.util.*;

public class QueueWtStack {
	Stack<Integer> s1;
	Stack<Integer> s2;
	
	public QueueWtStack(){
		s1 = new Stack<>();
		s2 = new Stack<>();
	}
	
	public void enqueue(int value){
		s1.push(value);
		//System.out.println(s1);
	}
	
	public int dequeue(){
		int val = 0;
		
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
		//System.out.println(s2);
		if(s2.isEmpty()){
			return -1; //no values are in stack
		}
		
		return s2.pop();
	}
	
	public int peek(){
		return s1.peek();
	}
}

/*
queue: 1 2 3
pop: 1
2
3


*/