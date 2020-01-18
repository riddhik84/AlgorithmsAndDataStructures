
public class DLLOperations {
	public static void main(String[] args){
		// Create a doubly linked list
		DLLNode headNode = createDoublyLinkedList(10);
		printDLL(headNode);
		
		//Delete a node by value
		DLLNode headNode_1 = deleteByValue(1, headNode);
		if(headNode_1 == null){
			System.out.println("Node to delete is not found");
		} else {
			printDLL(headNode_1);
		}
		

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