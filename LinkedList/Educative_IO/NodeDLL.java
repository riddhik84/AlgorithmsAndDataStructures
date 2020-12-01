
public class NodeDLL {
	public int data;
	public NodeDLL next;
	public NodeDLL prev;
	
	public NodeDLL(int data){
		this.data = data;
	}
	
	public NodeDLL(int data, NodeDLL next, NodeDLL prev){
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
}