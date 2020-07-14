/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class DeepCopyWithRandomPointers {
    public Node copyRandomList(Node head) {
        Node current = head;
        
        //Add 1 new node after every node in the existing linked list 
        while(current != null){
            Node clone = new Node(current.val);
            Node next = current.next;
            current.next = clone;
            clone.next = next;
            current = next;
        }
        
        //add the random pointer to the newly added nodes same as its copy nodes
        current = head;
        while(current != null){
            current.next.random = current.random == null ? null : current.random.next; //here use next to point to the additional nodes we have added.
            current = current.next.next;
        }
        
        //Create new head and segregate the two linked lists
        Node newHead = new Node(0);
        Node prev = newHead;
        current = head;
        
        while(current != null){
            Node next = current.next.next;
            prev.next = current.next;
            prev = prev.next;
            current.next = next;
            current = current.next;
        }
        return newHead.next;
        
    }
}
