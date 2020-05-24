
public class DeleteNode{
	public static void main(String[] args){
		//Input from leetcode
	}
	
	//41 / 41 test cases passed.
	//Status: Accepted
	//Runtime: 0 ms
	//Memory Usage: 39.1 MB
	//Since only 1 node is given, get next node's value in current node and
	//assign next node's next to current node
	 public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;        
    }
}

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}