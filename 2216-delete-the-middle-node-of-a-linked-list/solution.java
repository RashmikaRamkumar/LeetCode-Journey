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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=null;
        if(head==null || head.next==null)
        return null;
        while(fast!=null && fast.next!=null)
        {
            //System.out.println(slow.val);
            //System.out.println(fast.val);
            temp =slow; // we need the prev element not the mid ele as here it is not constained that the given element to be deleted will not be the end node so to tackle that we try to find the prev ele to the mid and do deletion as needed
            slow=slow.next;
            fast=fast.next.next;
        }
        //System.out.println(slow.val);

       // slow.val=slow.next.val;
       //not necessary here to assign the value as we deal the address here mainly
       if(temp!=null && temp.next!=null)
        temp.next=temp.next.next;
      
        return head;
    }
}
