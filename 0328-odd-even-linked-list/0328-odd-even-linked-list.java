/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
 public ListNode oddEvenList(ListNode head) 
    {
        
           if(head==null  || head.next==null)
           {
                return head;
           }
        
          ListNode odd=head;
          ListNode evenHead= head.next;
          ListNode currEvenNode= head.next;
        
          while(odd.next!=null && odd.next.next!=null)
          {
                 odd.next=odd.next.next;
              
                 odd=odd.next;
              
                 if(currEvenNode.next!=null)
                 {
                      currEvenNode.next= currEvenNode.next.next;
                     
                       currEvenNode=currEvenNode.next;
                 }
          }
        
          odd.next= evenHead;
        
          return head;
    } 
}

