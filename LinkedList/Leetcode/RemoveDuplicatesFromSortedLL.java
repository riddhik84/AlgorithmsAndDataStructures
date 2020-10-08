//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

//0ms run time in leetcode
class RemoveDuplicatesFromSortedLL {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode n = head;
        ListNode current = head;
        
        while(n != null){
            n = n.next;
            //System.out.println(n.val);
            if(n == null || current.val != n.val){
                current.next = n;
                current = current.next;
            }
        }
        
        return head;
    }
}
