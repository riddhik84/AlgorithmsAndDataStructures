
public class SLLOperations {
	public static void main(String[] args){
		System.out.println("Singaly Linked List");
		
		System.out.println("Create Linked List with 10 Nodes");
		Node headNode = createLinkedList(10);
		printLinkedList(headNode);
		
		System.out.println("Insert a Node at the end of the Linked List");
		insertNodeAtEnd(headNode);
		printLinkedList(headNode);
		
		System.out.println("Insert a Node after specified Node");
		insertNodeAfter(5, headNode);
		printLinkedList(headNode);
		
		System.out.println("Delete a Node after speficied Node");
		deleteNodeAfter(5, headNode);
		printLinkedList(headNode);
		
		
		System.out.println("Delete a specific Node");
		deleteANode(0, headNode);
		printLinkedList(headNode);
		
		System.out.println("Search a Node in Singly LinkList");
		System.out.println("Search result for 20 " + searchNode(20, headNode));

	}
	
	static Node createLinkedList(int nodeCount){
		Node headNode = new Node(0, null);
		Node current = headNode;
		
		for(int i = 1; i < nodeCount; i++){
			Node newNode = new Node(i, null);
			current.nextNode = newNode;
			current = newNode;
		}
		return headNode;
	}
	
	public static boolean searchNode(int data, Node headNode) {
		Node tmp = headNode;
		while(tmp != null){
			if (tmp.data == data){
				return true;
			}
			tmp = tmp.nextNode;
		}
		return false;
    }
	
	static void insertNodeAtEnd(Node headNode){
		Node tmp = headNode;
		//traverse till the end of the linked list
		while(tmp.nextNode != null){
			tmp = tmp.nextNode;
			//System.out.println(tmp.data);
		}
		Node newNode = new Node(100, null);
		tmp.nextNode = newNode;
	}
	
	static void insertNodeAfter(int nodeValue, Node headNode){
		Node tmp = headNode;
		while(tmp.nextNode != null){
			tmp = tmp.nextNode;
			
			if(tmp.data == nodeValue){
				Node newNode = new Node(1111, null);
				newNode.nextNode = tmp.nextNode;
				tmp.nextNode = newNode;
			}
		}	
				
	}
	
	static void deleteNodeAfter(int nodeValue, Node headNode){
		Node tmp = headNode;
		while(tmp.nextNode != null){
			if(tmp.data == nodeValue){
				tmp.nextNode = tmp.nextNode.nextNode;
			}
			tmp = tmp.nextNode;
		}
	}
	
	static void deleteANode(int nodeValue, Node headNode){
		Node tmp = headNode;
		while(tmp.nextNode != null){
			Node prev = tmp;
			tmp = tmp.nextNode;
			if(tmp.data == nodeValue){
				prev.nextNode = tmp.nextNode;
				break;
			}
		}
	}
	
	static void printLinkedList(Node headNode){
		Node tmp = headNode;
		while(tmp.nextNode!= null){
			System.out.print(tmp.data + "-> ");
			tmp = tmp.nextNode;
		}
		System.out.print(tmp.data);
		System.out.println();
	}	
}