

public class NthNodeFromEndSLL {
	public static void main(String[] args){
		//list1: 22->18->60->78->47->39->99->null
		int[] arr1 = {22,18,60,78,47,39,99};
		int num = 3;
		
		Node head1 = new Node(arr1[0], null);
		Node n = head1;
		for(int i = 1; i < arr1.length; i++){
			Node newNode = new Node(arr1[i], null);
			n.nextNode = newNode;
			n = n.nextNode;
		}
		
		printLL(head1);
		System.out.println();
		
		Node nFromEnd = getNthFromEnd(head1, num);
		System.out.println(nFromEnd.data);

	}
	
	//one pass solution using two pointers
	public static Node getNthFromEnd(Node head, int n){
		//Two pointers
		Node slow = head;
		Node fast = head;
		int counter = 0;
		
		//jump fast pointer till n 
		while(counter < n){
			
			if(fast == null)
				throw new IllegalArgumentException("Value of n is larger than list size");
				
			fast = fast.nextNode;
			counter++;
		}
		
		//traverse fast and slow pointers with gap of n
		while(fast != null){
			slow = slow.nextNode;
			fast = fast.nextNode;
		}
		
		return slow;	
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