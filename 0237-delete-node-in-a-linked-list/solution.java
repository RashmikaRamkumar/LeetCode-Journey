/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
        //dont think interms of addreass as we need head to acess or traverse the linked list intems of address and we only have the node whcih is to be deleted
        //we can simply do it by assigning the value of the next node it and as well as chanign the address to point the second next element from here
    }
}
