/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        
        int countA = 0;
        int countB = 0;
        
        ListNode A = headA;
        ListNode B = headB;
        
        //count nodes for both lists
        while(A.next != null){
            countA++;
            A = A.next;
        }
        while(B.next != null){
            countB++;
            B = B.next;
        }
        
        A = headA;
        B = headB;
        int diff = Math.abs(countA-countB);
        
        if(countA > countB){
            while(diff > 0){
                A = A.next;
                diff--;
            }
        } else {
            while(diff > 0){
                B = B.next;
                diff--;
            }
        }
        
        while(A != B){
            A = A.next;
            B = B.next;
        }
        
        return A;
    }
}
