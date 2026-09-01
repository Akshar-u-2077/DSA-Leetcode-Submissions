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
        ListNode slow=head;
        ListNode fast=head.next;
        ListNode prev=slow;
        while(fast!=null)
        {
            while(count!=n)
            {
                fast=fast.next;
                count++;
            }
            if(fast!=null)
            {
            prev=slow;
            slow=slow.next;
            fast=fast.next;
            }
        }
        if(slow==head)
        {
            head=head.next;
            slow.next=null;
            return head;
        }
        prev.next=slow.next;
        slow.next=null;
        return head;
    }
}