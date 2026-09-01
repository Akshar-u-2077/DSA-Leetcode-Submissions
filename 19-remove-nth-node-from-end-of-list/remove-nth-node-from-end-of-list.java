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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)
        {
            return null;
        }
        
        int count=1;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy.next;
        
        
        while(count!=n)
            {
                fast=fast.next;
                count++;
            }
        while(fast.next!=null)
        {
            
            
            slow=slow.next;
            fast=fast.next;
            
        }
        
        //prev.next=slow.next;
        slow.next=slow.next.next;
        //slow.next.next=null;
        head=dummy.next;
        return head;
    }
}