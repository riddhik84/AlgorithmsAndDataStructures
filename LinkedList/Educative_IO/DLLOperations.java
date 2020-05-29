
public class DLLOperations {
	public static void main(String[] args){
		// Create a doubly linked list
		DLLNode headNode = createDoublyLinkedList(10);
		printDLL(headNode);
		
		//TailNode
		DLLNode tailNode = getTailNode(headNode);
		if(tailNode != null){
			System.out.println("TailNode: " + tailNode.data);
		} else {
			System.out.println("TailNode is empty");
		}
		
		//Delete a node by value
		DLLNode headNode_1 = deleteByValue(1, headNode);
		if(headNode_1 == null){
			System.out.println("Node to delete is not found");
		} else {
			printDLL(headNode_1);
		}
		
		//Insert at end with tailNode
		DLLNode tailNodeNew = insertAtEnd(10, tailNode);
		tailNode = tailNodeNew;
		if(headNode_1 == null){
			System.out.println("Node to delete is not found");
		} else {
			printDLL(headNode_1);
		}
		
		//Delete at end with tailNode
		DLLNode tailNodeNew1 = deleteAtEnd(10, tailNode);
		tailNode = tailNodeNew1;
		if(headNode_1 == null){
			System.out.println("Node to delete is not found");
		} else {
			printDLL(headNode_1);
		}
		
		//Find length of Linked List
		System.out.println("Length of Linked List: " + DLL_Length(headNode_1));
	}
	
	static boolean isEmpty(DLLNode headNode){
		if(headNode == null){
			return true;
		} 
		return false;
	}
	
	static DLLNode createDoublyLinkedList(int totalNodes){
		DLLNode headNode = new DLLNode(0);
		headNode.prevNode = null;
		
		DLLNode currentNode = headNode;
		
		for(int i = 1; i < totalNodes; i++){
			DLLNode newNode = new DLLNode(i);
			newNode.prevNode = currentNode;
			currentNode.nextNode = newNode;
			currentNode = newNode;
		}
		return headNode;
	}
	
	static DLLNode getTailNode(DLLNode headNode){
		DLLNode currentNode = headNode;
		while(currentNode.nextNode != null){
			currentNode = currentNode.nextNode;
		}
		return currentNode;
	}
	
	static DLLNode insertAtEnd(int nodeValue, DLLNode tailNode){
		DLLNode newNode = new DLLNode(nodeValue);
		tailNode.nextNode = newNode;
		newNode.prevNode = tailNode;
		newNode.nextNode = null;
		
		tailNode = newNode;
		return tailNode;
	}
	
	static DLLNode deleteAtEnd(int nodeValue, DLLNode tailNode){
		tailNode.prevNode.nextNode = null;
		
		tailNode = tailNode.prevNode;
		return tailNode;
	}

	
	static DLLNode deleteByValue(int nodeValue, DLLNode headNode){
		if(headNode.data == nodeValue){
			//Delete headNode
			headNode = headNode.nextNode;
			return headNode;
		} else {
			DLLNode currentNode = headNode;
			while(currentNode.nextNode != null && currentNode.data != nodeValue){
				currentNode = currentNode.nextNode;
			}
			
			if(currentNode.nextNode != null && currentNode.data == nodeValue){
				currentNode.prevNode.nextNode = currentNode.nextNode;
			} else if(currentNode.nextNode == null && currentNode.data == nodeValue){
				//This is tail node
				currentNode.prevNode.nextNode = null;
			}
			return headNode;
		}
	}
	
	static int DLL_Length(DLLNode headNode){
		if(headNode == null){
			return 0;
		}else {
			DLLNode currentNode = headNode;
			int count = 0;
			while(currentNode != null){
				count++;
				currentNode = currentNode.nextNode;
			}
			return count;
		}
	}
	
	static void printDLL(DLLNode headNode){
		DLLNode current = headNode;
		while(current.nextNode != null){
			System.out.print(current.data + " -> ");
			current = current.nextNode;
		}
		System.out.print(current.data);
		System.out.println();
	}
}