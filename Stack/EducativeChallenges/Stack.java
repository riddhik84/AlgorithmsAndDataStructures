import java.util.LinkedList;
import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
	LinkedList<T> stack = new LinkedList<T>();
	
	//Empty constructor
	public Stack() {}
	
	public void push (T element){
		stack.addFirst(element);
	}
	
	public void pop (){
		if(isEmpty())
			throw new java.util.EmptyStackException();
		
		stack.removeFirst();
	}
	
	public int size(){
		return stack.size();
	}
	
	public boolean isEmpty(){
		if(stack.size() == 0){
			return true;
		}
		return false;
	}
	
	public T peek(){
		if(isEmpty())
			throw new java.util.EmptyStackException();
		
		return stack.getFirst();
	}
	
	public boolean search(T element){
		if(isEmpty())
			throw new java.util.EmptyStackException();
		return stack.contains(element);
	}
	
	public void print(){
		if(isEmpty())
			throw new java.util.EmptyStackException();
					
					
		System.out.print("Stack: " );
		for(T element : stack){
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	
	@Override
	public Iterator<T> iterator(){
		return stack.iterator();
	}
}