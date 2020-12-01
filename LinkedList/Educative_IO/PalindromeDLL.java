

public class PalindromeDLL {
	public static void main(String[] args){
		int[] not_palindrome = {1,2,3,4,5};
		NodeDLL head1 = createDLL(not_palindrome);
		printDLL(head1);
		
		int[] palindrome = {1,2,3,2,1};
		NodeDLL head2 = createDLL(palindrome);
		printDLL(head2);
		
		System.out.println(isPalindrome(head1));
		
		System.out.println(isPalindrome(head2));
		
	}
	
	//is doubly linked list palindrome?
	public static boolean isPalindrome(NodeDLL head){
		//two pointers start and end
		NodeDLL start = head;
		NodeDLL end = head;
		
		//go to end of the list
		while(end.next != null){
			end = end.next;
		}
		
		while(start != end){
			if(start.data != end.data){
				return false;
			} else {
				start = start.next;
				end = end.prev;
			}
		}
		
		return true;
	}
	
	//create a doubly linked list from array
	public static NodeDLL createDLL(int[] list){
		NodeDLL head = new NodeDLL(list[0]);
		head.prev = null;
		head.next = null;
		
		NodeDLL current = new NodeDLL(list[1]);
		head.next = current;
		
		for(int i = 2; i < list.length; i++)
		{
			NodeDLL newNode = new NodeDLL(list[i]);
			newNode.prev = current;
			current.next = newNode;
		
			current = newNode;
		}
		return head;
	}
	
	//print doubly linked list
	public static void printDLL(NodeDLL head){
		NodeDLL n = head;
		StringBuilder sb = new StringBuilder();
		
		while(n != null){
			sb.append(n.data);
			sb.append("<->");
			n = n.next;
		}
		sb.append("null");
		System.out.println(sb.toString());
	}
}