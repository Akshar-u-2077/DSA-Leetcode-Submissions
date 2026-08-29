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
    public ListNode reverseList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        else if(head.next==null)
        {
            return head;
        }
        else if(head.next.next==null)
        {
            ListNode cur=head;
            ListNode prev=head;
            cur=cur.next;
            cur.next=prev;
            prev.next=null;
            head=cur;
            return head;

        }
        else
        {
            ListNode prev=head;
            ListNode cur=head.next;
            ListNode Next =head.next.next;
            prev.next=null;
            while(Next.next!=null)
            {
                cur.next=prev;
                prev=cur;
                cur=Next;
                Next=Next.next;
            }
            cur.next=prev;
            Next.next=cur;
            head=Next;
            
        }
        return head;
    }
}