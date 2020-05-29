/**
* Find mid node in Linked List
* Time Compleity: O(n)
*
* @author Riddhi Kakadia
*/

public class MidNodeLL {
	public static void main(String[] args){
		MidNodeLL l = new MidNodeLL();
		
		//Create Singaly Linked List of 10 Nodes
		Node headNode = l.createLinkedList(10);
		
		//Find mid for Linked List
		int mid = l.midNodeLL(headNode);
		System.out.println("Middle Node of Linked List: " + mid);
				
	}
	
	//Inner class Node
	class Node {
		int data;
		Node nextNode;
		boolean visited = false;
		
		Node(int data){
			this.data = data;
		}
	}
	
	Node createLinkedList(int nodeCount){
		Node headNode = new Node(1);
		Node current = headNode;
		
		for(int i = 2; i <= nodeCount; i++){
			Node newNode = new Node(i);
			current.nextNode = newNode;
			current = newNode;
		}
		return headNode;
	}
	
	
	//Double pointer method to find mid of the linked list
	int midNodeLL(Node headNode){
		Node slow = headNode;
		Node fast = headNode;
				
		while(slow != null && fast != null && fast.nextNode != null)
        {
            fast = fast.nextNode.nextNode; //the fasr pointer will jump 2 steps 
			//Check if end of list is reached
			if(fast != null){
				slow = slow.nextNode;	//the slow pointer will jump 1 step
			}
        }
		return slow.data;
	}
}