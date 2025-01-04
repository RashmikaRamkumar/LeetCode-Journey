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
        Stack<ListNode> rev=new Stack<>();
        ListNode curr =head;
        if(curr==null)
            return curr;
        while(curr!=null)
        {
            rev.push(curr);
            curr=curr.next;
        }
        // while(!rev.isEmpty())
        // {
        //     System.out.println(rev.pop().val);
        // }
        ListNode newHead=rev.peek();
        System.out.println(rev.peek().val);
        ListNode temp=newHead;

        while(!rev.isEmpty())
        {
            temp.next=rev.pop();
            System.out.println(temp.next.val);
            temp=temp.next;
        }
        temp.next=null;
        return newHead;
    }   
   
}
