class Node{
  int value;
  Node next;
  
  Node(int value, Node next){
    this.value = value;
    this.next = next;
  }
  
}

class LinkedList {
  Node head;
  int nodeCount;
  
  LinkedList(int nodeCount){
    this.nodeCount = nodeCount;
  } 
  
  public Node getLinkedList(){
    Node head = new Node(1, null);
    if(this.nodeCount > 1){
      Node current = head;
      for(int i = 2; i <= this.nodeCount; i++){
        Node n = new Node(i, null);
        current.next = n;
        current = n;
      }  
    } else {
      return null;
    }  
    return head;
  }
}  

class Solution{
  public static void main (String[] args){
    LinkedList list = new LinkedList(5);
    Node head = list.getLinkedList();
    System.out.println("Head value: " + head.value);
    
  }  
}