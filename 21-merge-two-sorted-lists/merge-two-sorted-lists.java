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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1=list1;
        ListNode cur1=head1;
        ListNode head2=list2;
        ListNode cur2=head2;
        ListNode head;
        ListNode cur;
        if(head1==null || head2==null)
        {
            if(head1==null)
            {
                return list2;
            }
            else
            {
                return list1;
            }
        }
        if(cur1.val<cur2.val)
        {
            head=cur1;
            cur=head;
            cur1=cur1.next;  
                      
        }
        else
        {
            head=head2;
            cur=head;
            cur2=cur2.next; 
        }
        while(cur1!=null && cur2!=null)
        {
            if(cur1.val<cur2.val)
            {
                cur.next=cur1;
                cur1=cur1.next;
            }
            else
            {
                cur.next=cur2;
                cur2=cur2.next;
            }
            cur=cur.next;
        }
        if(cur1==null)
        {

            while(cur2!=null)
            {
                cur.next=cur2;
                cur2=cur2.next;
                cur=cur.next;
            }
        }
        else
        {
            while(cur1!=null)
            {
                cur.next=cur1;
                cur1=cur1.next;
                cur=cur.next;
            }
        }
        return head;
        

        
    }
}