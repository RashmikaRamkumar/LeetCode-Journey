/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean inOrder(TreeNode root,long[] prev)
    {
        if(root==null)
            return true;
        if(!inOrder(root.left,prev))
            return false;
        if(prev[0] >= root.val)
            return false;
        prev[0]=root.val; // update the value of prev whenever it surpasses the previous 2 conditions
        return inOrder(root.right,prev);
    }
    public boolean isValidBST(TreeNode root) {
        long[] prev={Long.MIN_VALUE};
        return inOrder(root,prev);
    }
}
