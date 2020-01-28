/*
* Queue implementation
*
* @author Riddhi Kakadia
*/

import java.util.LinkedList;
import java.util.Iterator;

public class Queue<T> implements Iterable<T> {
	LinkedList<T> list = new LinkedList<T>();
	
	public Queue(){
	}
	
	public Queue(T firstElement){
		list.addFirst(firstElement);
	}
	
	public void enqueue(T element){
		list.addLast(element);
	}
	
	public T dequeue(){
		if(isEmpty())
			throw new RuntimeException("Queue Empty");
		return list.removeFirst();
	}
	
	public T peek(){
		if(isEmpty())
			throw new RuntimeException("Queue Empty");
		return list.getFirst();
	}
	
	public boolean isEmpty(){
		if(list == null || list.size() == 0){
			return true;
		}
		return false;
	}
	
	public int size(){
		return list.size();
	}

	public void print(){
		for(T t : list){
			System.out.print(t + " ");
		}
		System.out.println();
	}
	
	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}
	
}