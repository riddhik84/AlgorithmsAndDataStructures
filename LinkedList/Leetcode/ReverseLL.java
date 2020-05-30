import java.io.*;
import java.util.*;
//Reverse the given linkedlist

class ReverseLL {
  
  public static void main(String[] args) {
    
    Node head = new Node(1);
    Node tmp = head;
    
    for(int i = 2; i <= 5; i++){
      Node n = new Node(i);
      tmp.next = n;
      tmp = tmp.next;
    }
    
    printLL(head);
    
    head = reverseLL(head);
    
    printLL(head);
    
  }

//reverse linkedlist
public static Node reverseLL(Node head){
  Node prev = null;
  Node current = head;
  Node next = null;
  
  while(current != null){
    next = current.next;
    current.next = prev;
    prev = current;
    current = next;
  }
  
  return prev;
}

static public void printLL(Node head){
  
  while(head != null)
  {
    System.out.print(head.value + " ");
    head = head.next;
  }
    System.out.println();
  }
}

class Node {
  int value;
  Node next;
  
  Node (int value){
   this.value = value;
   this.next = null;
  }
}
