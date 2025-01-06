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
    public void collect(TreeNode root, List<Integer> tree)
    {
        if(root!=null)
        {
        if(root.left==null && root.right==null)
            tree.add(root.val);
        collect(root.left,tree);
        collect(root.right,tree);
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null)
            return true;
        if(root1==null || root2==null)
            return false;
        List<Integer> tree1 = new ArrayList<>();
        List<Integer> tree2=new ArrayList<>();
        collect(root1,tree1);
        collect(root2,tree2);
        return tree1.equals(tree2);

    }
}
