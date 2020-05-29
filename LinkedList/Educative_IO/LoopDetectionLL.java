/**
* Detect a loop in Linked List
*
* @author Riddhi Kakadia
*/

public class LoopDetectionLL {
	public static void main(String[] args){
		LoopDetectionLL l = new LoopDetectionLL();
		
		//Create Singaly Linked List of 10 Nodes
		Node headNode = l.createLinkedList(5);
		
		//Detect loop in Singaly Linked List
		boolean loop = l.isLLLoopPresent(headNode);
		System.out.println("Linked List loop (visited property) : " + loop);
		
		boolean loop_ = l.doublePointerLoopDetection(headNode);
		System.out.println("Linked List loop (double pointer) : " + loop_);
		
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
		Node headNode = new Node(0);
		Node current = headNode;
		
		for(int i = 1; i < nodeCount; i++){
			Node newNode = new Node(i);
			current.nextNode = newNode;
			current = newNode;
		}
		//Generate a loop
		current.nextNode = headNode;
		
		return headNode;
	}
	
	//Keep track of visited nodes with visited property
	boolean isLLLoopPresent(Node headNode){
		Node current = headNode;
		
		while(current.nextNode != null){
			if(current.visited == true){
				return true;
			}
			current.visited = true;
			current = current.nextNode;
		}
		if(current.visited == true){
			return true;
		}
		return false;
	}
	
	//Double pointer loop detection method without keeping track of visited property
	boolean doublePointerLoopDetection(Node headNode){
		Node slow = headNode;
		Node fast = headNode;
				
		while(slow != null && fast != null && fast.nextNode != null)
        {
            slow = slow.nextNode;	//the slow pointer will jump 1 step
            fast = fast.nextNode.nextNode; //the fasr pointer will jump 2 steps 
			// when the pointers become equal then there must be a loop
            if(slow == fast){
                return true;
            }
        }
		return false;
	}
}