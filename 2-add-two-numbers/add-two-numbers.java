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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode cur1=l1;
        ListNode cur2=l2;
        ListNode head = new ListNode(0);
        ListNode cur=head;
        int carry=0;
        int prev_carry=0;
        int val1=0;
        int val2=0;
        while(cur1!=null || cur2!=null)
        {
            if(cur1==null)
            {
                val1=0;
                val2=cur2.val;
                cur2=cur2.next;
            }
            else if(cur2==null)
            {
                val2=0;
                val1=cur1.val;
                cur1=cur1.next;
            }
            else
            {
                val1=cur1.val;
                val2=cur2.val;
                cur1=cur1.next;
                cur2=cur2.next;
            }
            int sum=val1+val2;
            int temp=sum+prev_carry;
            prev_carry=temp/10;
            temp=temp%10;
            ListNode tempnode=new ListNode(0);
            tempnode.val=temp;
            cur.next=tempnode;
            cur=cur.next;
            
        }
        if(prev_carry!=0)
        {
            ListNode tempnode=new ListNode(0);
            tempnode.val=prev_carry;
            cur.next=tempnode;
        }
        cur=head;
        head=head.next;
        cur.next=null;

        return head;

    }
}