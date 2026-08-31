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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
        {
        return;
        }
        else
        {
            ListNode slow=head;
            ListNode fast=head;
            ListNode middle;
            ListNode second;
            while(slow.next!=null && fast.next!=null && fast.next.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            second=slow.next;
            slow.next=null;
            ListNode head2=second;
            ListNode prev=null;
            while(second!=null)
            {
                ListNode temp=second.next;
                second.next=prev;
                prev=second;
                second=temp;
            }
            second=prev;
            ListNode first=head;
            while(second!=null)
            {
                ListNode t1=first.next;
                ListNode t2=second.next;
                first.next=second;
                second.next=t1;
                first=t1;
                second=t2;
            }
            



            
            
            
            

            


        }   
        return;
    }
}