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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=list1;
        if(list1==null )
            return list2;
        if(list2==null)
            return list1;
        if(list1.val < list2.val)
        {
            list1=list1.next;
        }
        else
        {
            temp=list2;
            list2=list2.next;
        }
        ListNode res=temp;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }
            else
            {
                temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }
        }
        if(list1==null)
            temp.next=list2;
        else
            temp.next=list1;
        
        return res;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head=null;
        for(ListNode i : lists)
            head=mergeTwoLists(i,head);
        return head;
    }
}
