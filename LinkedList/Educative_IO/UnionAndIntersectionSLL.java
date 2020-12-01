import java.util.*;

public class UnionAndIntersectionSLL {
	public static void main(String[] args){
		//list1: 15->22->8->null
		//Output: 7->14->22->null
		int[] arr1 = {15,12,8};
		int[] arr2 = {7,14,8,22};
		
		Node head1 = new Node(arr1[0], null);
		Node n = head1;
		for(int i = 1; i < arr1.length; i++){
			Node newNode = new Node(arr1[i], null);
			n.nextNode = newNode;
			n = n.nextNode;
		}
		
		Node head2 = new Node(arr2[0], null);
		n = head2;
		for(int i = 1; i < arr2.length; i++){
			Node newNode = new Node(arr2[i], null);
			n.nextNode = newNode;
			n = n.nextNode;
		}
		
		printLL(head1);
		printLL(head2);
		
		System.out.println();
		
		Node intersection_head = intersection(head1, head2);
		printLL(intersection_head);
		
		Node union_head = union(head1, head2);
		printLL(union_head);

	}
	
	public static Node union(Node head1, Node head2){
		if(head1 == null)
			return head2;
		if(head2 == null)
			return head1;
			
		//traverse to the end of list1	
		Node n = head1;
		while(n.nextNode != null){
			n = n.nextNode;
		}
		//attach list2 at the end of list1
		n.nextNode = head2;
		//printLL(head1);
		
		//remove duplicates from the full list
		removeDuplicates(head1);
		
		return head1;
	}
	
	public static Node intersection(Node head1, Node head2){
		Node result = new Node(0, null);
		Node rs = result;
		
		if(head1 == null)
			return head2;
		if(head2 == null)
			return head1;
			
		//use hashset to keep track of existing values in list1
		HashSet<Integer> set = new HashSet<>();
		Node n = head1;
		
		while(n != null){
			set.add(n.data);
			n = n.nextNode;
		}
		
		n = head2;
		
		//iterate list2 and check the values exist in list1
		while(n != null){
			if(set.contains(n.data)){
				//create new node with intersection value and add it in the result
				Node newNode = new Node(n.data, null);
				rs.nextNode = newNode;	
				rs = rs.nextNode;
			}
			n = n.nextNode;
		}
		
		//return result.next considering result node as dummy node
		return result.nextNode;
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