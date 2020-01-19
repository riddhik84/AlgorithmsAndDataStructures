
public class SLLReverse {
	class Node_ {
		int data;
		Node_ nextNode;
		
		Node_(int data){
			this.data = data;
		}
	}
	public static void main(String[] args){
		System.out.println("Singaly Linked List Reverse");
		
		System.out.println("Create Singly Linked List with 10 Nodes");
		SLLReverse instance = new SLLReverse();
		Node_ headNode = instance.createLinkedList(10);
		instance.printLinkedList(headNode);
		
		System.out.println("Reverse Singly Linked List");
		Node_ revHeadNode = instance.reverseSLL(headNode);
		instance.printLinkedList(revHeadNode);
	}
	
	Node_ createLinkedList(int nodeCount){
		Node_ headNode = new Node_(0);
		Node_ current = headNode;
		
		for(int i = 1; i < nodeCount; i++){
			Node_ newNode = new Node_(i);
			current.nextNode = newNode;
			current = newNode;
		}
		return headNode;
	}
	
	//Reverse prev and next for each node and make the last node as new headNode to reverse the linked list
	Node_ reverseSLL (Node_ headNode){
		Node_ currentNode = headNode;
		Node_ prevNode = null;
		Node_ nextNode = null;
		
		while(currentNode != null){
			nextNode = currentNode.nextNode;
			currentNode.nextNode = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		headNode = prevNode;
		return headNode;
	}
	
	void printLinkedList(Node_ headNode){
		Node_ tmp = headNode;
		while(tmp.nextNode!= null){
			System.out.print(tmp.data + "-> ");
			tmp = tmp.nextNode;
		}
		System.out.print(tmp.data);
		System.out.println();
	}	
}