class RotateLinkedList {
//Calculate total moves required
//make the linked list circular
//detach move node and next node
//create new head and return that head

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return head;
        
        //check the length of the linked list
        ListNode n = head;
        int len = 1;
        while(n.next != null){
            n = n.next;
            len++;
        }
        //System.out.println(len);
        
        //calculate moves
        int move = len - k%len;
        //System.out.println(move);
        
        //create circular LL
        n.next = head;
        //System.out.println(n.next.val);
        
        n = head;
        ListNode prev = head;
        while(move > 0){
            prev = n;
            move --;
            n = n.next;
        }
        //System.out.println(prev.val);
        //System.out.println(n.val);
        
        head = n;
        prev.next = null;
        
        return head;
    }
}
