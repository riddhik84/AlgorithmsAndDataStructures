
public class TestQueueWtStack{
	public static void main(String[] args){
		QueueWtStack queue = new QueueWtStack();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		System.out.println(queue.dequeue());
		queue.enqueue(4);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		System.out.println(queue.dequeue());
	
	}
}