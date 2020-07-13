/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class FlattenMultilevelDoublyLinkedList {
    public Node flatten(Node head) {
        if(head == null)
            return head;
        
        Node dummy = new Node();
        dummy.next = head;
        
        Node prev = dummy;
        Node current = dummy;
        
        Stack<Node> stack = new Stack<>();
        stack.push(head);
        
        while(!stack.isEmpty()){
            //System.out.println(current.val);
            current = stack.pop();
            
            prev.next = current;
            current.prev = prev;
            
            if(current.next != null){
                stack.push(current.next);
            }
            if(current.child != null){
                    stack.push(current.child);
                    current.child = null;
            } 
            prev = current;
         }
        dummy.next.prev = null;
        return dummy.next;
    }
}
