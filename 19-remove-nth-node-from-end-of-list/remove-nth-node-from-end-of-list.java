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
        
        if(head==null)
        {
            return head;
        }
        if(head.next==null)
        {
            return null;
        }
        ListNode cur=head;
        int count=0;
        while(cur!=null)
        {
            cur=cur.next;
            count++;
        }
        
        int nth_node=count-n;
        cur=head;
        ListNode temp=cur;
        
        count=0;
        while(cur!=null)
        {
            if(count==nth_node)
            {
                
                if(cur==head)
                {
                    head=head.next;
                }
                temp.next=cur.next;
                cur.next=null;
                return head;
            }
            temp=cur;
            cur=cur.next;
            
            count++;
            
        }
        return head;

        
    }
}