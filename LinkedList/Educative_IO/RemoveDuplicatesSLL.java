import java.util.HashSet;

public class RemoveDuplicatesSLL {
	public static void main(String[] args){
		//Input: 7->14->21->14->22->7->null
		//Output: 7->14->21->22->null
		int[] arr = {7,14,21,14,22,7};
		
		Node head = new Node(arr[0], null);
		Node n = head;
		for(int i = 1; i < arr.length; i++){
			Node newNode = new Node(arr[i], null);
			n.nextNode = newNode;
			n = n.nextNode;
		}
		
		printLL(head);
		
		removeDuplicates(head);
		
		printLL(head);
	}
	
	public static void removeDuplicates(Node head){
		//use hashset to keep track of duplicate values
		HashSet<Integer> set = new HashSet<>();
		//two pointers required: current and prev to remove current node when duplicate is found
		Node n = head;
		Node prev = head;
		
		while(n != null){
			if(!set.add(n.data)){
				//remove duplicate node n
				prev.nextNode = n.nextNode;
			} 
			//increment prev and current nodes
			prev = n;
			n = n.nextNode;			
		}
	}
	
	public static void printLL(Node head){
		Node n = head;
		StringBuilder sb = new StringBuilder();
		while(n != null){
			sb.append(n.data);
			sb.append("->");
			n = n.nextNode;
		}
		sb.append("null");
		System.out.println(sb.toString());
	}
}